/** 
 * Project Name:Learner 
 * File Name:UserDao.java 
 * Package Name:cn.osbullshit.learner.java.dao 
 * Date:2017年6月7日下午1:58:56 
 * 
 */  
  
package cn.osbullshit.learner.java.dao;  

import java.util.List;

import cn.osbullshit.learner.java.pojo.UserBean;

/** 
 * ClassName:UserDao 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月7日 下午1:58:56 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface UserDao {
	/**
	 * 
	 * listAll:加载用户
	 * 
	 * @author baoqi.zhang 
	 * @param user
	 * @return 
	 * @since JDK 1.7
	 */
	List<UserBean> listAll(UserBean user);
}
 