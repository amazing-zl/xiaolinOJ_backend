package com.yupi.springbootinit.service;

import com.yupi.springbootinit.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.springbootinit.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.User;

/**
* @author zhanglin
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-12-11 23:49:32
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    Long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

}
