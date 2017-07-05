/** 
 * Project Name:Learner 
 * File Name:ADDaoImpl.java 
 * Package Name:cn.osbullshit.learner.dao.mongo 
 * Date:2017年7月5日下午4:44:48 
 * 
 */  
  
package cn.osbullshit.learner.dao.mongo;  

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import cn.learner.util.mongodb.MongoBaseDao;
import cn.osbullshit.learner.dto.AdvertDto;

/** 
 * ClassName:ADDaoImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月5日 下午4:44:48 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */

@Repository("adDaoImpl")  
public class ADDaoImpl implements MongoBaseDao<AdvertDto>{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<AdvertDto> findAll(Map<String, Object> arg0) throws Exception {
		
		return null;
	}

	@Override
	public AdvertDto findOne(Map<String, Object> arg0) throws Exception {
		
		return null;
	}

	@Override
	public void insert(AdvertDto arg0) throws Exception {
	}

	@Override
	public void remove(Map<String, Object> arg0) throws Exception {
	}

	@Override
	public void update(Map<String, Object> arg0) throws Exception {
	}

}
 