/** 
 * Project Name:Learner 
 * File Name:AdvertBean.java 
 * Package Name:cn.osbullshit.learner.pojo 
 * Date:2017年7月6日下午4:29:54 
 * 
 */  
  
package cn.osbullshit.learner.pojo;  

import org.springframework.data.mongodb.core.mapping.Document;

import cn.learner.util.mongodb.BaseDocument;

/** 
 * ClassName:AdvertBean 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月6日 下午4:29:54 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Document(collection = "advert")
public class AdvertBean extends BaseDocument{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 正文
	 */
	private String context;
	
	/**
	 * 导航
	 */
	private String href;
	
	/**
	 * 打开方式
	 */
	private String target;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	
}
 