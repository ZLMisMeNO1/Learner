/** 
 * Project Name:Learner 
 * File Name:ApplicationFilter.java 
 * Package Name:cn.osbullshit.learner.filter 
 * Date:2017年6月13日上午11:08:54 
 * 
 */  
  
package cn.osbullshit.learner.filter;  

import java.io.IOException;
//import java.util.Arrays;
//import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/** 
 * ClassName:ApplicationFilter 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月13日 上午11:08:54 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ApplicationFilter implements Filter{

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=UTF-8");
		String coding = response.getCharacterEncoding();
		System.out.println("coding:"+coding);
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
 