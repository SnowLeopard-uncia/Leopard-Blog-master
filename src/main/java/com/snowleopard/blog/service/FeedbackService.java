package com.snowleopard.blog.service;

import com.snowleopard.blog.entity.Blogs;
import com.snowleopard.blog.entity.Feedback;

import java.util.List;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/26
 */
public interface FeedbackService {
    int insertFeedback(Feedback feedback);

    List<Feedback> selectAllFeedback();
}
