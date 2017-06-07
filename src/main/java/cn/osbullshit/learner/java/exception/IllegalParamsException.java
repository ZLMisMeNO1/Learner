/** 
 * Project Name:Learner 输入参数不合法、空等异常
 * File Name:IllegalParamsException.java 
 * Package Name:cn.osbullshit.learner.java.exception 
 * Date:2017年6月7日下午2:28:51 
 * 
 * 
 */

package cn.osbullshit.learner.java.exception;

import org.apache.log4j.Logger;

/**
 * ClassName:IllegalParamsException Function: TODO ADD FUNCTION. Date: 2017年6月7日
 * 下午2:28:51
 * 
 * @author baoqi.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class IllegalParamsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(IllegalParamsException.class);
	
	private String message;

	public IllegalParamsException() {
		log.error("输入参数为空 或 其他异常");
		this.message = "参数不合法";
	}

	public IllegalParamsException(String msg) {
		log.error("输入参数为空 或 其他异常");
		this.message = msg;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
