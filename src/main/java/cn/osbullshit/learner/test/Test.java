package cn.osbullshit.learner.test;


import org.junit.BeforeClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.learner.util.globalDto.PageResult;
import cn.learner.util.mongodb.BaseCondition;

public class Test {

	private static PersonDao userDaoImpl;
	private static ClassPathXmlApplicationContext app;

	@BeforeClass
	public static void initSpring() {
		try {
			app = new ClassPathXmlApplicationContext(new String[] {
					"classpath:learner-mongo.xml",
					"classpath:learner-application.xml" });
			userDaoImpl = (PersonDao) app.getBean("userDaoImpl");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@org.junit.Test
	public void testAdd() throws Exception {
//		Person p ;
//		for(int i=0;i<100;i++){
//			p = new Person();
//			p.setAge(i);
//			p.setName("test");
//			userDaoImpl.insert(p);
//			p = null;
//		}
		BaseCondition condition = BaseCondition.getSelf();
		condition.setPage(2);
		condition.setRow(3);
		Long time = 1499325832630L ;
		PageResult<Person> page = userDaoImpl.listPageByTime(condition,time);
		System.out.println(page.getTotalPage());
	}
}
