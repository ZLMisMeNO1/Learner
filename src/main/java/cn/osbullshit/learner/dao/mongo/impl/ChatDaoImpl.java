/** 
 * Project Name:Learner 
 * File Name:ChatDaoImpl.java 
 * Package Name:cn.osbullshit.learner.dao.mongo.impl 
 * Date:2017年7月7日上午9:38:20 
 * 
 */  
  
package cn.osbullshit.learner.dao.mongo.impl;  

import org.springframework.stereotype.Repository;

import cn.learner.util.mongodb.MongoBaseDaoImpl;
import cn.osbullshit.learner.dao.mongo.ChatDao;
import cn.osbullshit.learner.pojo.ChatBean;

/** 
 * ClassName:ChatDaoImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月7日 上午9:38:20 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository(value="chatDaoImpl")
public class ChatDaoImpl extends MongoBaseDaoImpl<ChatBean> implements ChatDao{

}
 