package com.snowleopard.blog.api.admin;

import com.snowleopard.blog.common.ServiceResultEnum;
import com.snowleopard.blog.entity.Blogs;
import com.snowleopard.blog.param.BlogsInsertParam;
import com.snowleopard.blog.param.UserLoginParam;
import com.snowleopard.blog.service.BlogsService;
import com.snowleopard.blog.util.Result;
import com.snowleopard.blog.util.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

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
}
