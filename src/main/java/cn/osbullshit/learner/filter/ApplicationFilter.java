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






import java.io.OutputStream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


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

	private static Logger log = Logger.getLogger(ApplicationFilter.class);
	
	
	@Override
	public void destroy() {
		log.info("应用过滤器已销毁");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=UTF-8");
		String coding = response.getCharacterEncoding();
		log.info("应用过滤器--页面编码:" + coding);
		OutputStream os = response.getOutputStream();
		os.write(new String("w3c认证").getBytes());
		os.flush();
		os.close();
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filter) throws ServletException {
		log.info("应用过滤器已初始化:" + filter);
	}
	
	    
}
 