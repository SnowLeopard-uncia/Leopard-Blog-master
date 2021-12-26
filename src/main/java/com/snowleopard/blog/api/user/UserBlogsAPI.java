package com.snowleopard.blog.api.user;

import com.snowleopard.blog.api.VO.BlogsVO;
import com.snowleopard.blog.api.VO.ListVO;
import com.snowleopard.blog.common.ServiceResultEnum;
import com.snowleopard.blog.entity.Blogs;
import com.snowleopard.blog.param.BlogsInsertParam;
import com.snowleopard.blog.service.BlogsService;
import com.snowleopard.blog.util.Result;
import com.snowleopard.blog.util.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.bytebuddy.matcher.FilterableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
@RestController
@Api(value = "v1", tags = "2-1 首页博客相关接口")
@RequestMapping("api/v1")
public class UserBlogsAPI {
    @Autowired
    BlogsService blogsService;

    @CrossOrigin
    @GetMapping("/blogs/blog")
    @ApiOperation(value = "获取博客接口")
    public Result getAllBlogs() {
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
    @GetMapping("/blogs/detail/{blogsId}")
    @ApiOperation(value = "获取博客详情接口")
    public Result getBlogDetail(@PathVariable("blogsId") @RequestBody Long blogsId) {
      Blogs blog = blogsService.selectBlogsById(blogsId);
      BlogsVO blogsVO =new BlogsVO(blog.getBlogsId(),
              blog.getBlogsTitle(),blog.getBlogsDescription()
      ,blog.getCreateTime());
        if (blog!=null){
            return ResultGenerator.genSuccessResult(ServiceResultEnum.SUCCESS.getResult(),blogsVO);
        }else {
            return ResultGenerator.genFailResult(ServiceResultEnum.ERROR.getResult());
        }
    }
}
