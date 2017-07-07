/** 
 * Project Name:Learner 
 * File Name:ChatBean.java 
 * Package Name:cn.osbullshit.learner.pojo 
 * Date:2017年7月7日上午9:35:52 
 * 
 */  
  
package cn.osbullshit.learner.pojo;  

import org.springframework.data.mongodb.core.mapping.Document;

import cn.learner.util.mongodb.BaseDocument;

/** 
 * ClassName:ChatBean 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月7日 上午9:35:52 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Document(collection="chat")
public class ChatBean extends BaseDocument{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ip;
	
	private String msg;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

	
}
 