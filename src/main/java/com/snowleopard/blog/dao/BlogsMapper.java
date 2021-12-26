package com.snowleopard.blog.dao;

import com.snowleopard.blog.entity.Blogs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
@Mapper
@Repository
public interface BlogsMapper {
    int insertBlog(Blogs blogs);

    List<Blogs> selectAllBlogs();

    List<Blogs> selectShowBlogs();

    Blogs selectByBlogId(Long blogsId);
}
