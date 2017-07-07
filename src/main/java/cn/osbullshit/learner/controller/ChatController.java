/** 
 * Project Name:Learner 
 * File Name:ChatController.java 
 * Package Name:cn.osbullshit.learner.controller 
 * Date:2017年7月7日上午9:49:50 
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
import cn.learner.util.user.Brower;
import cn.osbullshit.learner.service.ChatService;

/** 
 * ClassName:ChatController 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月7日 上午9:49:50 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Controller
@RequestMapping("chat")
public class ChatController {

	@Autowired
	ChatService chatService;
	
	@RequestMapping("index")
	public ModelAndView chat() {
		return new ModelAndView("chat/index");
	}
	
	@RequestMapping("addChat")
	@ResponseBody
	public ResultMap addChat(HttpServletRequest request,String msg) throws Exception {
		ResultMap result = new ResultMap();
		if(InputCheck.isEmpty(msg)) {
			result.setState(-1);
		} else {
			chatService.addChat(Brower.getIpAddr(request), URLDecoder.decode(msg,"utf-8"));
			result.setState(200);
		}
		return result;
	}
	
	@RequestMapping("list")
	public void listChatMessage(@RequestParam(name="page",defaultValue="1")int page,
			@RequestParam(name="rows",defaultValue="15") int rows
//			,@RequestParam(name="repty",defaultValue="1000") int repty
			,Long time
			,HttpServletResponse response) throws Exception {
		
		WebConnectionDto dto = new WebConnectionDto("chat",1000);
		
		dto.addData("newmessage", chatService.getHistoryChatMessage(page, rows, time));
        WebConnection.message(response, dto);
	}
}
 