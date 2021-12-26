package com.snowleopard.blog.service;

import com.snowleopard.blog.api.VO.BlogsVO;
import com.snowleopard.blog.entity.Blogs;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
public interface BlogsService {
    int insertBlogs(Blogs blogs);

    List<Blogs> selectAllBlogs();

    List<BlogsVO> selectShowBlogs();

    List<BlogsVO> selectDraftBlogs();

    Blogs selectBlogsById(Long blogsId);

    int updateDeleteBlogs(ArrayList<Integer> ids);
}
