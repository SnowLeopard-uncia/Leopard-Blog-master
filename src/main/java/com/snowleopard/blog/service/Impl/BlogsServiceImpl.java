package com.snowleopard.blog.service.Impl;

import com.snowleopard.blog.api.VO.BlogsVO;
import com.snowleopard.blog.common.ServiceResultEnum;
import com.snowleopard.blog.dao.BlogsMapper;
import com.snowleopard.blog.entity.Blogs;
import com.snowleopard.blog.service.BlogsService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
@Service
public class BlogsServiceImpl implements BlogsService {
    @Autowired
    BlogsMapper blogsMapper;

    @Override
    public int insertBlogs(Blogs blogs) {
        int result = blogsMapper.insertBlog(blogs);
       return result;
    }

    @Override
    public List<Blogs> selectAllBlogs() {
        return blogsMapper.selectAllBlogs();
    }

    @Override
    public List<BlogsVO> selectShowBlogs() {
        List<Blogs> blogsList=blogsMapper.selectShowBlogs();
        List<BlogsVO> blogsVOList =new ArrayList<>();
        for (Blogs blogs:blogsList) {
            BlogsVO blogsVO = new BlogsVO();
            blogsVO.setBlogsId(blogs.getBlogsId());
            blogsVO.setBlogsTitle(blogs.getBlogsTitle());
            blogsVO.setBlogsDescription(blogs.getBlogsDescription());
            blogsVO.setBlogsTime(blogs.getCreateTime());
            blogsVOList.add(blogsVO);
        }
        System.out.println(blogsVOList.toString());
        return blogsVOList;
    }

    @Override
    public List<BlogsVO> selectDraftBlogs() {
        List<Blogs> blogsList=blogsMapper.selectAllBlogs();
        List<BlogsVO> blogsVOList =new ArrayList<>();
        for (Blogs blogs:blogsList) {
            if (blogs.getDraft()==1 && blogs.getIsDeleted()==0){
                BlogsVO blogsVO = new BlogsVO();
                blogsVO.setBlogsId(blogs.getBlogsId());
                blogsVO.setBlogsTitle(blogs.getBlogsTitle());
                blogsVO.setBlogsDescription(blogs.getBlogsDescription());
                blogsVO.setBlogsTime(blogs.getCreateTime());
                blogsVOList.add(blogsVO);
            }
        }
        System.out.println(blogsVOList.toString());
        return blogsVOList;
    }


    @Override
    public Blogs selectBlogsById(Long blogsId) {
        return blogsMapper.selectByBlogId(blogsId);
    }

    @Override
    public int updateDeleteBlogs(ArrayList<Integer> ids) {
        int count = 0;
        for (Integer blogIds:ids) {
           Blogs blogs= blogsMapper.selectByBlogId(Long.valueOf(blogIds));
           blogs.setIsDeleted(1);
           count = count+blogsMapper.updateUserByBlogsIdSelective(blogs);
        }
        return count;
    }


}
