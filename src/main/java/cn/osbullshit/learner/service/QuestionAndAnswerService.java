package cn.osbullshit.learner.service;

import java.sql.Timestamp;
import java.util.List;

import cn.learner.util.globalDto.PageResult;
import cn.osbullshit.learner.pojo.QuestionAndAnswerBean;

public interface QuestionAndAnswerService {
	
	/**
	 * 
	 * listQuestionAndAnswers:分页加载试题
	 * 
	 * @author baoqi.zhang 
	 * @param page
	 * @param rows
	 * @return 
	 * @since JDK 1.7
	 */
	PageResult<QuestionAndAnswerBean> listQuestionAndAnswers(int page,int rows,String language);
	
	/**
	 * 
	 * getQuestionAndAnswer:加载单个试题
	 * 
	 * @author baoqi.zhang 
	 * @param id
	 * @return 
	 * @since JDK 1.7
	 */
	QuestionAndAnswerBean getQuestionAndAnswer(String id) ;
	
	QuestionAndAnswerBean addQuestionAndAnswer(String id, String userId, String question,
			String answer, String title, Integer isDelete,
			Timestamp update_time, String language, Integer sortNum);
}
