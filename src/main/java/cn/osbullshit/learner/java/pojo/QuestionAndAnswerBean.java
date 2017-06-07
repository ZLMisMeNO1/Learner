package cn.osbullshit.learner.java.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class QuestionAndAnswerBean implements Serializable{

	/**   
	 * @Fields serialVersionUID :
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String userId;
	
	private String question;
	
	private String answer;
	
	private Integer isDelete;
	
	private Timestamp update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Timestamp getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	
	

}
