/** 
 * Project Name:Learner 
 * File Name:ADController.java 
 * Package Name:cn.osbullshit.learner.controller 
 * Date:2017年7月5日下午2:31:04 
 * 
 */  
  
package cn.osbullshit.learner.controller;  

import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.learner.util.empty.InputCheck;
import cn.learner.util.globalDto.ResultMap;
import cn.learner.util.socket.WebConnection;
import cn.learner.util.socket.WebConnectionDto;
import cn.osbullshit.learner.service.AdvertService;

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
	
	@Autowired
	AdvertService advertService;
	
	@RequestMapping("index")
	public ModelAndView index() {
		return new ModelAndView("test");
	}
	
	@RequestMapping("message")
	public void adMsg(@RequestParam(value="page",defaultValue="1")int page
			,@RequestParam(value="rows",defaultValue="15") int rows ,
			HttpServletResponse  response
			,HttpServletRequest request) throws Exception{
		WebConnectionDto dto = new WebConnectionDto("myevent",10000);
		
		dto.addData("result", advertService.listAds(page, rows));
        WebConnection.message(response, dto);
	}
	
	@RequestMapping("load")
	public ModelAndView ad(){
		return new ModelAndView("ad");
	}
	
	@RequestMapping("addAdvert")
	@ResponseBody
	public ResultMap addAdvert(String title,String context,String href ,String target) throws Exception {
		ResultMap result = new ResultMap();
		if(InputCheck.isEmpty(title)) {
			result.setState(-1);
		} else {
			advertService.addAdvert( URLDecoder.decode(title,"utf-8"),  URLDecoder.decode(context,"utf-8"),
					URLDecoder.decode(href,"utf-8"),  URLDecoder.decode(target,"utf-8"));
			result.setState(200);
		}
		return result;
	}
}
 