/** 
 * Project Name:Learner 
 * File Name:UserController.java 
 * Package Name:cn.osbullshit.learner.java.controller 
 * Date:2017年6月7日下午2:17:39 
 * 
 */  
  
package cn.osbullshit.learner.java.controller;  


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.osbullshit.learner.java.dto.ResultMap;
import cn.osbullshit.learner.java.exception.IllegalParamsException;
import cn.osbullshit.learner.java.service.UserService;

/** 
 * ClassName:UserController 用户controller
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月7日 下午2:17:39 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Controller
@RequestMapping("java/user")
public class UserController {
	
	private static Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping("list")
	@ResponseBody
	public ResultMap listUsers(String id,String name,String openId) throws Exception {
		
		if(null == id ) {
			throw new IllegalParamsException();
		}
		
		ResultMap result = new ResultMap();
		
		try{
			result.setData(userService.listUsers(id, name, openId));
			result.setState(1);
		}catch(Exception e){
			log.error("出现错误:"+e.getMessage());
			e.printStackTrace();
			result.setState(-1);
			result.setMessage(e.getMessage());
		}
		
		return result;
	}
	
}
 