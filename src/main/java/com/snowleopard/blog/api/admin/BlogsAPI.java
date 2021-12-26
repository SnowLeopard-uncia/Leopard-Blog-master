package com.snowleopard.blog.api.admin;

import com.snowleopard.blog.api.VO.BlogsVO;
import com.snowleopard.blog.api.VO.ListVO;
import com.snowleopard.blog.common.ServiceResultEnum;
import com.snowleopard.blog.entity.Blogs;
import com.snowleopard.blog.entity.Feedback;
import com.snowleopard.blog.param.BlogsInsertParam;
import com.snowleopard.blog.param.UserLoginParam;
import com.snowleopard.blog.service.BlogsService;
import com.snowleopard.blog.service.FeedbackService;
import com.snowleopard.blog.util.Result;
import com.snowleopard.blog.util.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
@RestController
@Api(value = "v1", tags = "1-2 博客相关接口")
@RequestMapping("manage-api/v1")
public class BlogsAPI {
    @Autowired
    BlogsService blogsService;

    @Autowired
    FeedbackService feedbackService;

    @CrossOrigin
    @PostMapping("/blogs/blog")
    @ApiOperation(value = "创建博客接口")
    public Result blogsInsert(@RequestHeader("application/json") @RequestBody @Validated BlogsInsertParam blogsInsertParam) {
        Blogs blogs = new Blogs(blogsInsertParam.getBlogsTitle(),
                blogsInsertParam.getBlogsDescription(),
               0, blogsInsertParam.getIsPost(),
                blogsInsertParam.getDraft(), new Timestamp(System.currentTimeMillis()));

       int result= blogsService.insertBlogs(blogs);
        if (result>0){
            return ResultGenerator.genSuccessResult(ServiceResultEnum.SUCCESS.getResult());
        }else {
            return ResultGenerator.genFailResult(ServiceResultEnum.ERROR.getResult());
        }
    }

    @CrossOrigin
    @PostMapping("/blogs/draft")
    @ApiOperation(value = "创建草稿博客接口")
    public Result blogsInsertDraft(@RequestHeader("application/json") @RequestBody @Validated BlogsInsertParam blogsInsertParam) {
        Blogs blogs = new Blogs(blogsInsertParam.getBlogsTitle(),
                blogsInsertParam.getBlogsDescription(),
                0, blogsInsertParam.getIsPost(),
                blogsInsertParam.getDraft(), new Timestamp(System.currentTimeMillis()));

        int result= blogsService.insertBlogs(blogs);
        if (result>0){
            return ResultGenerator.genSuccessResult(ServiceResultEnum.SUCCESS.getResult());
        }else {
            return ResultGenerator.genFailResult(ServiceResultEnum.ERROR.getResult());
        }
    }

    @CrossOrigin
    @GetMapping("/blogs/allBlogs")
    @ApiOperation(value = "获取所有博客接口")
    public Result getAllBlogs() {
        List<Blogs> blogsList =blogsService.selectAllBlogs();
        List<List<Blogs>> list = new ArrayList<>();
        list.add(blogsList);
        ListVO<List<Blogs>> lists = new ListVO<>();
        lists.setList(list);

        if (blogsList.size()>0){
            return ResultGenerator.genSuccessResult(lists);
        }else {
            return ResultGenerator.genFailResult(ServiceResultEnum.ERROR.getResult(),0);
        }
    }

    @CrossOrigin
    @GetMapping("/blogs/public-blog")
    @ApiOperation(value = "获取已发布博客接口")
    public Result getPublicBlogs() {
        List<BlogsVO> blogsList =blogsService.selectShowBlogs();
        List<List<BlogsVO>> list = new ArrayList<>();
        list.add(blogsList);
        ListVO<List<BlogsVO>> lists = new ListVO<>();
        lists.setList(list);

        if (blogsList.size()>0){
            return ResultGenerator.genSuccessResult(lists);
        }else {
            return ResultGenerator.genSuccessResult(ServiceResultEnum.SUCCESS.getResult(),0);
        }
    }

    @CrossOrigin
    @PutMapping("/blogs/blog")
    @ApiOperation(value = "删除博客接口")
    public Result deleteBlogs(@RequestHeader("application/json") @RequestBody ArrayList<Integer> ids) {
       int result=  blogsService.updateDeleteBlogs(ids);
        if (result>0){
            return ResultGenerator.genSuccessResult(result);
        }else {
            return ResultGenerator.genFailResult(ServiceResultEnum.ERROR.getResult(),0);
        }
    }



    @CrossOrigin
    @GetMapping("/blogs/draft-blog")
    @ApiOperation(value = "获取草稿博客接口")
    public Result getDraftBlogs() {
        List<BlogsVO> blogsList =blogsService.selectDraftBlogs();
        List<List<BlogsVO>> list = new ArrayList<>();
        list.add(blogsList);
        ListVO<List<BlogsVO>> lists = new ListVO<>();
        lists.setList(list);

        if (blogsList.size()>0){
            return ResultGenerator.genSuccessResult(lists);
        }else {
            return ResultGenerator.genSuccessResult(ServiceResultEnum.SUCCESS.getResult(),0);
        }
    }

    @CrossOrigin
    @GetMapping("/blogs/allFeedback")
    @ApiOperation(value = "获取所有留言接口")
    public Result getallFeedback() {
        List<Feedback> feedbacks =feedbackService.selectAllFeedback();
        List<List<Feedback>> list = new ArrayList<>();
        list.add(feedbacks);
        ListVO<List<Feedback>> lists = new ListVO<>();
        lists.setList(list);

        if (feedbacks.size()>0){
            return ResultGenerator.genSuccessResult(lists);
        }else {
            return ResultGenerator.genFailResult(ServiceResultEnum.ERROR.getResult(),0);
        }
    }


}
