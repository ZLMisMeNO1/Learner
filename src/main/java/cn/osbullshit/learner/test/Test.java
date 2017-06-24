package cn.osbullshit.learner.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static PersonDao userDaoImpl;
	private static ClassPathXmlApplicationContext app;
	private static String collectionName;

	@BeforeClass
	public static void initSpring() {
		try {
			app = new ClassPathXmlApplicationContext(new String[] {
					"classpath:learner-mongo.xml",
					"classpath:learner-application.xml" });
			userDaoImpl = (PersonDao) app.getBean("userDaoImpl");
			collectionName = "person";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@org.junit.Test
	public void testAdd() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", "tom");
		Person p = userDaoImpl.findOne(params, collectionName);
		System.out.println("user.count()==" + p.getName());
	}
}
