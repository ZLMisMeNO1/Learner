/** 
 * Project Name:Learner 
 * File Name:UserBean.java 
 * Package Name:cn.osbullshit.learner.java.pojo 
 * Date:2017年6月7日下午1:59:54 
 * 
 */  
  
package cn.osbullshit.learner.java.pojo;  

import java.io.Serializable;

/** 
 * ClassName:UserBean 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月7日 下午1:59:54 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class UserBean implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	
	private String name;
	
	private String openId;

	public UserBean(){
		
	}
	
	public UserBean(String id, String name, String openId) {
		super();
		this.id = id;
		this.name = name;
		this.openId = openId;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	
}
 