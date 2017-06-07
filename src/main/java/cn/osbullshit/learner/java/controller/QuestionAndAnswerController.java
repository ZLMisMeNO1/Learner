package cn.osbullshit.learner.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.osbullshit.learner.java.dto.ResultMap;
import cn.osbullshit.learner.java.service.QuestionAndAnswerService;

@Controller
@RequestMapping("java/q&a")
public class QuestionAndAnswerController {

	@Autowired
	QuestionAndAnswerService questionAndAnswerService;

	@RequestMapping("get")
	@ResponseBody
	public ResultMap getQandA(Integer id) {

		ResultMap result = new ResultMap();

		if (null == id) {
			id = 1;
		}
		try {
			result.setState(1);
			result.setData(questionAndAnswerService.getQuestionAndAnswer(id));
		} catch (Exception e) {
			result.setState(-1);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
