package com.snowleopard.blog.dao;

import com.snowleopard.blog.entity.Blogs;
import com.snowleopard.blog.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/26
 */
@Mapper
@Repository
public interface FeedBackMapper {
    int insertFeedBack(Feedback feedback);

    List<Feedback> selectAllFeedback();

}
