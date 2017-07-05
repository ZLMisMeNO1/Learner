/** 
 * Project Name:Learner 
 * File Name:ADController.java 
 * Package Name:cn.osbullshit.learner.controller 
 * Date:2017年7月5日下午2:31:04 
 * 
 */  
  
package cn.osbullshit.learner.controller;  

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cn.learner.util.socket.WebConnection;
import cn.learner.util.socket.WebConnectionDto;

/** 
 * ClassName:ADController 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月5日 下午2:31:04 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RequestMapping(value = "ad")
@Controller
public class ADController {
	
	@RequestMapping("index")
	public ModelAndView index() {
		return new ModelAndView("test");
	}
	
	Integer a = 0;
	@RequestMapping("message")
	public void send(HttpServletResponse  response){
		String title = "请求了"+(a++)+"次";
		
		WebConnectionDto dto = new WebConnectionDto("myevent",10000);
		dto.addData("detail","这是一个广告");
		dto.addData("title",title);
        WebConnection.message(response, dto);
	}
	
	@RequestMapping("load")
	public ModelAndView ad(){
		return new ModelAndView("ad");
	}
}
 