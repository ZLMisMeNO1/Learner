package cn.osbullshit.learner.java.dao;

import cn.osbullshit.learner.java.pojo.QuestionAndAnswerBean;

public interface QuestionAndAnswerDao {
	/**
	 * 
	 * @Title: getQandA   获取试题
	 * @Description: 
	 * @param: @param id
	 * @param: @return      
	 * @return: QuestionAndAnswerBean      
	 * @throws   
	 * @author baoqi.zhang
	 */
	QuestionAndAnswerBean getQandA(Integer id);
}
