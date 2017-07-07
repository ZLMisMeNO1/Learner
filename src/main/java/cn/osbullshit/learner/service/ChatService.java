/** 
 * Project Name:Learner 
 * File Name:ChatService.java 
 * Package Name:cn.osbullshit.learner.service 
 * Date:2017年7月7日上午9:39:30 
 * 
 */  
  
package cn.osbullshit.learner.service;  

import java.util.List;
import java.util.Map;

/** 
 * ClassName:ChatService 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月7日 上午9:39:30 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface ChatService {

	/**
	 * 
	 * addChat:添加聊天信息
	 * 
	 * @author baoqi.zhang 
	 * @param ip
	 * @param msg
	 * @throws Exception 
	 * @since JDK 1.7
	 */
	void addChat(String ip, String msg) throws Exception;
	
	/**
	 * 
	 * getHistoryChatMessage:获取历史信息
	 * 
	 * @author baoqi.zhang 
	 * @param page
	 * @param rows
	 * @param time
	 * @return
	 * @throws Exception 
	 * @since JDK 1.7
	 */
	List<Map<String,Object>> getHistoryChatMessage(int page,int rows ,Long time) 
				throws Exception;
}
 