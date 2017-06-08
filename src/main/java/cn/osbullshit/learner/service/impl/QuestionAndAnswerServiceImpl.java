package cn.osbullshit.learner.service.impl;


import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.osbullshit.learner.dao.QuestionAndAnswerDao;
import cn.osbullshit.learner.pojo.QuestionAndAnswerBean;
import cn.osbullshit.learner.service.QuestionAndAnswerService;

@Service
public class QuestionAndAnswerServiceImpl implements QuestionAndAnswerService{

	@Autowired
	QuestionAndAnswerDao questionAndAnswerDao;
	
	@Override
	public List<QuestionAndAnswerBean> listQuestionAndAnswers(int page, int rows,String language) {
		int start = (page-1) * rows + 1;
		int end = page * rows;
		
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("start", start);
		params.put("end", end);
		params.put("language", language);
		return questionAndAnswerDao.listQuestionAndAnswers(params);
	}

	@Override
	public QuestionAndAnswerBean getQuestionAndAnswer(String id) {
		
		return questionAndAnswerDao.getQuestionAndAnswer(id);
	}

	@Override
	public QuestionAndAnswerBean addQuestionAndAnswer(String id, String userId,
			String question, String answer, String title, Integer isDelete,
			Timestamp update_time, String language, Integer sortNum) {
		
		return null;
	}

}
