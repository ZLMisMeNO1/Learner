/** 
 * Project Name:Learner 
 * File Name:AdvertDto.java 
 * Package Name:cn.osbullshit.learner.dto 
 * Date:2017年7月5日下午4:45:59 
 * 
 */  
  
package cn.osbullshit.learner.dto;  

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.data.mongodb.core.mapping.Document;

/** 
 * ClassName:AdvertDto 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月5日 下午4:45:59 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Document(collection="advert")
public class AdvertDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String data;
	
	private String event = "advert";

	private Timestamp createTime ;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	
}
 