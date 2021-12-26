package com.snowleopard.blog.service.Impl;

import com.snowleopard.blog.dao.FeedBackMapper;
import com.snowleopard.blog.entity.Feedback;
import com.snowleopard.blog.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/26
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    FeedBackMapper feedBackMapper;

    @Override
    public int insertFeedback(Feedback feedback) {
        int result  = feedBackMapper.insertFeedBack(feedback);
        return result;
    }

    @Override
    public List<Feedback> selectAllFeedback() {
        return feedBackMapper.selectAllFeedback();
    }
}
