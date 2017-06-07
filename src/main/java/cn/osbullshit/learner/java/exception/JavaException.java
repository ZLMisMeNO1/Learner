/** 
 * Project Name:Learner 
 * File Name:JavaException.java 
 * Package Name:cn.osbullshit.learner.java.exception 
 * Date:2017年6月7日下午2:11:28 
 * 
 */  
  
package cn.osbullshit.learner.java.exception;  

import org.apache.log4j.Logger;

/** 
 * ClassName:JavaException 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月7日 下午2:11:28 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class JavaException extends Exception{

	private static Logger log = Logger.getLogger(JavaException.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void print(){
		log.error("发生错误");
		super.printStackTrace();
	}
}
 