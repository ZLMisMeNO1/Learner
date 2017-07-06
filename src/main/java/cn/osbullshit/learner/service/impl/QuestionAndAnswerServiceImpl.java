package cn.osbullshit.learner.service.impl;


import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.learner.util.globalDto.PageResult;
import cn.osbullshit.learner.dao.mysql.QuestionAndAnswerDao;
import cn.osbullshit.learner.pojo.QuestionAndAnswerBean;
import cn.osbullshit.learner.service.QuestionAndAnswerService;

@Service
public class QuestionAndAnswerServiceImpl implements QuestionAndAnswerService{

	@Autowired
	QuestionAndAnswerDao questionAndAnswerDao;
	
	@Override
	public PageResult<QuestionAndAnswerBean> listQuestionAndAnswers(int page, int rows,String language) {
		
		PageResult<QuestionAndAnswerBean> pageResult = new PageResult<QuestionAndAnswerBean>();
		
		int start = (page-1) * rows + 1;
		int end = page * rows;
		pageResult.setPageNumber(page);
		pageResult.setPageSize(rows);
		
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("start", start);
		params.put("end", end);
		params.put("language", language);
		pageResult.setRows(questionAndAnswerDao.listQuestionAndAnswers(params));
		return pageResult;
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
