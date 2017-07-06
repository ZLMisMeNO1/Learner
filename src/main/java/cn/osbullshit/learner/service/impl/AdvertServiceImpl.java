/** 
 * Project Name:Learner 
 * File Name:AdvertServiceImpl.java 
 * Package Name:cn.osbullshit.learner.service.impl 
 * Date:2017年7月6日下午4:35:00 
 * 
 */  
  
package cn.osbullshit.learner.service.impl;  


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.learner.util.globalDto.PageResult;
import cn.learner.util.mongodb.BaseCondition;
import cn.osbullshit.learner.dao.mongo.AdvertDao;
import cn.osbullshit.learner.pojo.AdvertBean;
import cn.osbullshit.learner.service.AdvertService;

/** 
 * ClassName:AdvertServiceImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月6日 下午4:35:00 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class AdvertServiceImpl implements AdvertService{

	@Resource(name="advertDaoImpl")
	AdvertDao advertDao;
	
	@SuppressWarnings("unchecked")
	@Override
	public void addAdvert(String title, String context, String href,
			String target) throws Exception {
		
		AdvertBean ad = new AdvertBean();
		ad.setContext(context);
		ad.setHref(href);
		ad.setTarget(target);
		ad.setTitle(title);
		
		advertDao.insert(ad);
	}

	@SuppressWarnings("unchecked")
	@Override
	public PageResult<AdvertBean> listAds(int page, int rows) throws Exception {
		BaseCondition condition = BaseCondition.getSelf();
		condition.setPage(page);
		condition.setRow(rows);
		return advertDao.listPageByNormal(condition);
	}

}
 