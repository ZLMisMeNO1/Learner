/** 
 * Project Name:Learner 
 * File Name:AdvertService.java 
 * Package Name:cn.osbullshit.learner.service 
 * Date:2017年7月6日下午4:33:54 
 * 
 */  
  
package cn.osbullshit.learner.service;  


import cn.learner.util.globalDto.PageResult;
import cn.osbullshit.learner.pojo.AdvertBean;

/** 
 * ClassName:AdvertService 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月6日 下午4:33:54 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface AdvertService {

	/**
	 * 
	 * addAdvert:添加广告
	 * 
	 * @author baoqi.zhang 
	 * @param titile
	 * @param context
	 * @param href
	 * @param target
	 * @throws Exception 
	 * @since JDK 1.7
	 */
	void addAdvert(String titile, String context ,String href 
			,String target ) throws Exception;
	
	/**
	 * 
	 * listAds:加载广告
	 * 
	 * @author baoqi.zhang 
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception 
	 * @since JDK 1.7
	 */
	PageResult<AdvertBean> listAds(int page , int rows) throws Exception;
}
 