/** 
 * Project Name:Learner 
 * File Name:ChatServiceImpl.java 
 * Package Name:cn.osbullshit.learner.service.impl 
 * Date:2017年7月7日上午9:41:28 
 * 
 */  
  
package cn.osbullshit.learner.service.impl;  

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.learner.util.globalDto.PageResult;
import cn.learner.util.mongodb.BaseCondition;
import cn.osbullshit.learner.dao.mongo.ChatDao;
import cn.osbullshit.learner.pojo.ChatBean;
import cn.osbullshit.learner.service.ChatService;

/** 
 * ClassName:ChatServiceImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年7月7日 上午9:41:28 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class ChatServiceImpl implements ChatService{

	@Resource(name="chatDaoImpl")
	ChatDao chatDao;
	
	@SuppressWarnings("unchecked")
	@Override
	public void addChat(String ip, String msg) throws Exception {
		ChatBean bean = new ChatBean();
		bean.setIp(ip);
		bean.setMsg(msg);
		chatDao.insert(bean);
	}

	@Override
	public List<Map<String, Object>> getHistoryChatMessage(int page, int rows,
			Long time) throws Exception {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		BaseCondition condition = BaseCondition.getSelf();
		condition.setPage(page);
		condition.setRow(rows);
		@SuppressWarnings("unchecked")
		PageResult<ChatBean> pageResult = chatDao.listPageByTime(condition, time);
		Map<String,Object> map = null;
		if(null != pageResult && null != pageResult.getRows() && pageResult.getRows().size() > 0) {
			for(ChatBean bean : pageResult.getRows()) {
				map = new HashMap<String,Object>();
				map.put("msg", bean.getMsg());
				map.put("time", bean.getCreateTime());
				list.add(map);
			}
		}
		return list;
	}

}
 