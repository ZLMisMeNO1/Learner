/** 
 * Project Name:Learner 
 * File Name:IndexController.java 
 * Package Name:cn.osbullshit.learner.java.controller 
 * Date:2017年6月7日下午1:06:54 
 * 
 */  
  
package cn.osbullshit.learner.controller;  

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.osbullshit.learner.dto.WebConnectionDto;

/** 
 * ClassName:IndexController 首页
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月7日 下午1:06:54 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Controller
@RequestMapping("java")
public class IndexController {

	@RequestMapping("index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("test")
	public ModelAndView test() {
		return new ModelAndView("test");
	}
	
	Integer a = 0;
	@RequestMapping("send")
	public void send(HttpServletResponse  response) throws IOException{
		response.setHeader("Content-Type", "text/event-stream");
		response.setHeader("Cache-Control", "no-cache");
//		response.setContentType("charset=UTF-8");
		String message = "请求了"+(a++)+"次";
		System.out.println(message);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("a", "a");
		map.put("b", "b");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("v");
		map.put("c",list);
		WebConnectionDto dto = new WebConnectionDto("myevent");
		dto.addData("map",map);
		dto.addData("string",message);
        PrintWriter out = response.getWriter();
        out.println(dto.toString());
        out.flush();
	    out.close();    
	}
}
 