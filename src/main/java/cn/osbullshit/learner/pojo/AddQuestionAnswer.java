/** 
 * Project Name:Learner 
 * File Name:AddQuestionAnswer.java 
 * Package Name:cn.osbullshit.learner.pojo 
 * Date:2017年6月8日下午7:55:06 
 * 
 */

package cn.osbullshit.learner.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ClassName:AddQuestionAnswer Function: TODO ADD FUNCTION. Date: 2017年6月8日
 * 下午7:55:06
 * 
 * @author baoqi.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class AddQuestionAnswer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String userId;
	
	private String title;
	
	private String question;
	
	private String answer;
	
	private String language;
	
	private Timestamp update_time;
	
	private Boolean canOk;
	
	private Integer agree;
	
	private Integer disagree;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Timestamp getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}

	public Boolean getCanOk() {
		return canOk;
	}

	public void setCanOk(Boolean canOk) {
		this.canOk = canOk;
	}

	public Integer getAgree() {
		return agree;
	}

	public void setAgree(Integer agree) {
		this.agree = agree;
	}

	public Integer getDisagree() {
		return disagree;
	}

	public void setDisagree(Integer disagree) {
		this.disagree = disagree;
	}
	
	
}
