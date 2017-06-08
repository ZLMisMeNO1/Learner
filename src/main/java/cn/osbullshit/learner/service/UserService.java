/** 
 * Project Name:Learner 
 * File Name:UserService.java 
 * Package Name:cn.osbullshit.learner.java.service 
 * Date:2017年6月7日下午2:08:21 
 * 
 */

package cn.osbullshit.learner.service;

import java.util.List;

import cn.osbullshit.learner.pojo.UserBean;

/**
 * ClassName:UserService Function: TODO ADD FUNCTION. Date: 2017年6月7日 下午2:08:21
 * 
 * @author baoqi.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public interface UserService {

	List<UserBean> listUsers(String id, String name, String openId);
}
