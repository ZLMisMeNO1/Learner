package cn.osbullshit.learner.test;


import org.springframework.data.mongodb.core.mapping.Document;

import cn.learner.util.mongodb.BaseDocument;


@Document(collection="person")
public class Person extends BaseDocument{

	/**   
	 * @Fields serialVersionUID :
	 */
	private static final long serialVersionUID = 1L;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private String name;
	private Integer age;
	
}
