/** 
 * Project Name:Learner 
 * File Name:AopTestController.java 
 * Package Name:cn.osbullshit.learner.aop 
 * Date:2017年7月13日上午8:46:01 
 * 
 */  
  
package cn.osbullshit.learner.aop;  

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * ClassName:AopTestController 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月13日 上午8:46:01 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Controller
@RequestMapping("aop")
public class AopTestController {

	private Logger log = Logger.getLogger(AopTestController.class);
	
	@RequestMapping("index")
	public void index(String name) {
		log.info("hello "+name);
	}
	
	@RequestMapping("getStr")
	@ResponseBody
	public String getStr(String name) {
		try{
			String a = null;
			a.length();
		} catch(Exception e){
			throw new RuntimeException("尼玛，发生错误啦！");
		}
		return "hi " + name;
	}
	
	@RequestMapping("getError")
	public void getError(String name){
		System.out.println(name.length());
	}
}
 