package cn.osbullshit.learner.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;

@Repository("userDaoImpl")  
public class PersonDaoImpl implements PersonDao{

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void insert(Person object) {
		mongoTemplate.insert(object);
	}

	@Override
	public Person findOne(Map<String, Object> params) {
		return mongoTemplate.findOne(
				new Query(Criteria.where("name").is(params.get("name"))),
				Person.class);
	}



//	@Override
//	public void createCollection(String name) {
//		mongoTemplate.createCollection(name);
//	}


	@Override
	public List<Person> findAll(Map<String, Object> arg0) throws Exception {
		
		return null;
	}

	@Override
	public void remove(Map<String, Object> arg0) throws Exception {
	}

	@Override
	public void update(Map<String, Object> arg0) throws Exception {
	}
}
