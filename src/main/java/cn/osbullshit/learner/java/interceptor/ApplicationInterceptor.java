package cn.osbullshit.learner.java.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ApplicationInterceptor implements HandlerInterceptor {
	
	private Logger logger = Logger.getLogger(ApplicationInterceptor.class);

	
	// 当request处理完成后被调用
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		logger.info("afterCompletion");
	}

	/**
	 * 在handler被执行后被调用
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2, ModelAndView modelAndView)
			throws Exception {
		logger.info("postHandle");
	}

	// 在实际的handler被执行前被调用
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2) throws Exception {
		return true;
	}



}
