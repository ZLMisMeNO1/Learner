
package cn.osbullshit.learner.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * ClassName: ApplicationInterceptor  应用拦截器
 * date: 2017年6月7日 下午3:13:15  
 * 
 * @author baoqi.zhang
 * @since JDK 1.7
 */
public class ApplicationInterceptor implements HandlerInterceptor {
	
	private Logger logger = Logger.getLogger(ApplicationInterceptor.class);

	
	// 当request处理完成后被调用
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		logger.info("应用拦截器：afterCompletion");
	}

	/**
	 * 在handler被执行后被调用
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2, ModelAndView modelAndView)
			throws Exception {
		logger.info("应用拦截器：postHandle");
	}

	// 在实际的handler被执行前被调用
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2) throws Exception {
		logger.info("应用拦截器：preHandle");
		logger.info("执行注入的service层代码");
		return true;
	}



}
