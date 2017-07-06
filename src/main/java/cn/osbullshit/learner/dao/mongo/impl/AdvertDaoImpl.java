/** 
 * Project Name:Learner 
 * File Name:AdvertDaoImpl.java 
 * Package Name:cn.osbullshit.learner.dao.mongo.impl 
 * Date:2017年7月6日下午4:29:09 
 * 
 */  
  
package cn.osbullshit.learner.dao.mongo.impl;  

import org.springframework.stereotype.Repository;

import cn.learner.util.mongodb.MongoBaseDaoImpl;
import cn.osbullshit.learner.dao.mongo.AdvertDao;
import cn.osbullshit.learner.pojo.AdvertBean;

/** 
 * ClassName:AdvertDaoImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月6日 下午4:29:09 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository(value="advertDaoImpl")
public class AdvertDaoImpl extends MongoBaseDaoImpl<AdvertBean>implements AdvertDao{

}
 