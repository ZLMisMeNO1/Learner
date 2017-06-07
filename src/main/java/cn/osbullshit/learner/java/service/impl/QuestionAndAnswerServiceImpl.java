package cn.osbullshit.learner.java.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.osbullshit.learner.java.dao.QuestionAndAnswerDao;
import cn.osbullshit.learner.java.pojo.QuestionAndAnswerBean;
import cn.osbullshit.learner.java.service.QuestionAndAnswerService;

@Service
public class QuestionAndAnswerServiceImpl implements QuestionAndAnswerService{

	@Autowired
	QuestionAndAnswerDao questionAndAnswerDao;
	
	@Override
	public QuestionAndAnswerBean getQuestionAndAnswer(Integer id) {
		
		return questionAndAnswerDao.getQandA(id);
	}

}
