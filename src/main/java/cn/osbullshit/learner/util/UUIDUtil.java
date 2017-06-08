/** 
 * Project Name:Learner 
 * File Name:UUIDUtil.java 
 * Package Name:cn.osbullshit.learner.java.util 
 * Date:2017年6月8日下午7:17:43 
 * 
 */  
  
package cn.osbullshit.learner.util;  

import java.util.UUID;

/** 
 * ClassName:UUIDUtil 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月8日 下午7:17:43 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class UUIDUtil {

	public static String uuid() {
		return UUID.randomUUID().toString();
	}
}
 