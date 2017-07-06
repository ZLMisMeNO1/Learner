package cn.osbullshit.learner.test;


import org.springframework.stereotype.Repository;

import cn.learner.util.mongodb.MongoBaseDaoImpl;

@Repository("userDaoImpl")  
public class PersonDaoImpl extends MongoBaseDaoImpl<Person> implements PersonDao{



}
