/** 
 * Project Name:Learner 
 * File Name:UserServiceImpl.java 
 * Package Name:cn.osbullshit.learner.java.service.impl 
 * Date:2017年6月7日下午2:15:05 
 * 
 */  
  
package cn.osbullshit.learner.service.impl;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.osbullshit.learner.dao.UserDao;
import cn.osbullshit.learner.pojo.UserBean;
import cn.osbullshit.learner.service.UserService;

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

	@Autowired
	UserDao userDao;
	
	@Override
	public List<UserBean> listUsers(String id, String name, String openId)
			{
		return userDao.listAll(new UserBean(id,name,openId));
	}

}
 