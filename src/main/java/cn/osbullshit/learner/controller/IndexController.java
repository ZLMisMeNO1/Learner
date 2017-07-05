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

import cn.learner.util.socket.WebConnection;
import cn.learner.util.socket.WebConnectionDto;


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
	
}
 