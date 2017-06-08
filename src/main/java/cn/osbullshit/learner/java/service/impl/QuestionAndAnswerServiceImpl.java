package cn.osbullshit.learner.java.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<QuestionAndAnswerBean> listQuestionAndAnswers(int page, int rows) {
		int start = (page-1) * rows + 1;
		int end = page * rows;
		
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("start", start);
		params.put("end", end);
		
		return questionAndAnswerDao.listQuestionAndAnswers(params);
	}

	@Override
	public QuestionAndAnswerBean getQuestionAndAnswer(Integer id) {
		
		return questionAndAnswerDao.getQuestionAndAnswer(id);
	}

}
