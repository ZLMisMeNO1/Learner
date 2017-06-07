package cn.osbullshit.learner.java.service;

import cn.osbullshit.learner.java.pojo.QuestionAndAnswerBean;

public interface QuestionAndAnswerService {
	
	/**
	 * 
	 * @Title: getQuestionAndAnswer  获取试题 
	 * @Description: 
	 * @param: @param id 当id为空时，默认id = 1
	 * @param: @return      
	 * @return: QuestionAndAnswerBean      
	 * @throws   
	 * @author baoqi.zhang
	 */
	QuestionAndAnswerBean getQuestionAndAnswer(Integer id);
}
