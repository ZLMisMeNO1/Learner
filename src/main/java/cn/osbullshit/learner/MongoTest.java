/** 
 * Project Name:Learner 
 * File Name:MongoTest.java 
 * Package Name:cn.osbullshit.learner 
 * Date:2017年6月23日下午4:40:25 
 * 
 */  
  
package cn.osbullshit.learner;  



import org.bson.BsonDocument;
import org.bson.BsonString;
import org.bson.BsonValue;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

/** 
 * ClassName:MongoTest 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年6月23日 下午4:40:25 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class MongoTest {

	public static void  main(String[] args) {
			MongoClient mongo = new MongoClient("127.0.0.1",27017);
			System.out.println(mongo);
			
			MongoDatabase learner = mongo.getDatabase("learner");
			
			MongoIterable<String> collections = learner.listCollectionNames();
			
			for(String collName : collections) {
				System.out.println(collName);
			}
			BsonDocument query = new BsonDocument();
			query.append("name", new BsonString("zhangbaoqi"));
			MongoCollection<Document> persons = learner.getCollection("person");
			BsonDocument update = new BsonDocument();
			query.append("sex", new BsonString("男"));
			Document up = persons.findOneAndUpdate(query, update);
			System.out.println(up.toJson());
			persons.insertOne(new Document("name","ayasix"));
	}
}
 