/** 
 * Project Name:Learner 
 * File Name:UserServiceImpl.java 
 * Package Name:cn.osbullshit.learner.java.service.impl 
 * Date:2017年6月7日下午2:15:05 
 * 
 */  
  
package cn.osbullshit.learner.java.service.impl;  

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.osbullshit.learner.java.dao.UserDao;
import cn.osbullshit.learner.java.pojo.UserBean;
import cn.osbullshit.learner.java.service.UserService;

/** 
 * ClassName:UserServiceImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月7日 下午2:15:05 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class UserServiceImpl implements UserService{

	@Resource
	UserDao userDao;
	
	@Override
	public List<UserBean> listUsers(String id, String name, String openId)
			{
		return userDao.listAll(new UserBean(id,name,openId));
	}

}
 