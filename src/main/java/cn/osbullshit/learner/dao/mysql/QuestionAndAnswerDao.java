package cn.osbullshit.learner.dao.mysql;

import java.util.List;
import java.util.Map;

import cn.osbullshit.learner.pojo.QuestionAndAnswerBean;

public interface QuestionAndAnswerDao {
	/**
	 * 
	 * listQuestionAndAnswers:分页加载试题
	 * 
	 * @author baoqi.zhang 
	 * @param params
	 * @return 
	 * @since JDK 1.7
	 */
	List<QuestionAndAnswerBean> listQuestionAndAnswers(Map<String,Object> params);
	
	/**
	 * 
	 * getQuestionAndAnswer:获取单个试题
	 * 
	 * @author baoqi.zhang 
	 * @param id
	 * @return 
	 * @since JDK 1.7
	 */
	QuestionAndAnswerBean getQuestionAndAnswer(String id);
	
	/**
	 * 
	 * getMaxId:获取当前试题id的最大值，
	 * 在增加试题时，应该使id值连续
	 * 
	 * @author baoqi.zhang 
	 * @return 
	 * @since JDK 1.7
	 */
	Integer getMaxNum(String language);
}
