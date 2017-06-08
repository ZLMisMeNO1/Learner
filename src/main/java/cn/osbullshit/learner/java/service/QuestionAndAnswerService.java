package cn.osbullshit.learner.java.service;

import java.util.List;

import cn.osbullshit.learner.java.pojo.QuestionAndAnswerBean;

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
	List<QuestionAndAnswerBean> listQuestionAndAnswers(int page,int rows);
	
	/**
	 * 
	 * getQuestionAndAnswer:加载单个试题
	 * 
	 * @author baoqi.zhang 
	 * @param id
	 * @return 
	 * @since JDK 1.7
	 */
	QuestionAndAnswerBean getQuestionAndAnswer(Integer id) ;
}
