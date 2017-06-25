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

	@Override
	public List<Person> findAll(Map<String, Object> params, String collectionName) {
		List<Person> result = mongoTemplate.find(new Query(Criteria.where("age")
				.lt(params.get("maxAge"))), Person.class, collectionName);
		return result;
	}

	@Override
	public void update(Map<String, Object> params, String collectionName) {
		 mongoTemplate.upsert(new Query(Criteria.where("age")
				.is(params.get("age"))), new Update().set("name",
				params.get("name")), Person.class, collectionName);
	}

//	@Override
//	public void createCollection(String name) {
//		mongoTemplate.createCollection(name);
//	}

	@Override
	public void remove(Map<String, Object> params, String collectionName) {
		mongoTemplate.remove(new Query(Criteria.where("id")
				.is(params.get("id"))), Person.class, collectionName);
	}
}
