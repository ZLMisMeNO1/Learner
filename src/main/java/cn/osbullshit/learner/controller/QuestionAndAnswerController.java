package cn.osbullshit.learner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.osbullshit.learner.dto.ResultMap;
import cn.osbullshit.learner.service.QuestionAndAnswerService;

@Controller
@RequestMapping("java/q&a")
public class QuestionAndAnswerController {

	@Autowired
	QuestionAndAnswerService questionAndAnswerService;

	/**
	 * 
	 * listJavaQandAByPage:分页加载java试题
	 * 
	 * @author baoqi.zhang 
	 * @param rows
	 * @param page
	 * @return 
	 * @since JDK 1.7
	 */
	@RequestMapping("listJavaQandAByPage")
	@ResponseBody
	public ResultMap listJavaQandAByPage(@RequestParam(value = "rows",defaultValue = "1") int rows
			,@RequestParam(value = "page",defaultValue = "1") int page,String language) {

		ResultMap result = new ResultMap();
		
		if(null == language) {
			result.setState(-1);
			result.setMessage("未指定语言");
			return result;
		}
		try {
			result.setState(1);
			result.setData(questionAndAnswerService.listQuestionAndAnswers(page,rows,language));
		} catch (Exception e) {
			result.setState(-1);
			result.setMessage(e.getMessage());
		}
		return result;
	}
	
	/**
	 * 
	 * getJavaQandAById:根据id获取单个试题
	 * 
	 * @author baoqi.zhang 
	 * @param id
	 * @return 
	 * @since JDK 1.7
	 */
	@RequestMapping("getJavaQandAById")
	@ResponseBody
	public ResultMap getJavaQandAById(String qId) {
		ResultMap result = new ResultMap();
		
		if(null == qId) {
			result.setState(-1);
			result.setMessage("参数不足！");
			return result;
		}
		
		try {
			result.setState(1);
			result.setData(questionAndAnswerService.getQuestionAndAnswer(qId));
		} catch (Exception e) {
			result.setState(-1);
			result.setMessage(e.getMessage());
		}
		
		return result;
	}
}
