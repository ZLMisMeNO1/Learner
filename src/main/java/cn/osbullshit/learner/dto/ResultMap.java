/** 
 * Project Name:Learner 
 * File Name:ResultMap.java 
 * Package Name:cn.osbullshit.learner.java.dto 
 * Date:2017年6月7日下午2:09:20 
 * 
 */

package cn.osbullshit.learner.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;

/**
 * ClassName:ResultMap 应用层返回格式定义 Function: TODO ADD FUNCTION. Date: 2017年6月7日
 * 下午2:09:20
 * 
 * @author baoqi.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class ResultMap implements Serializable {

	private static final Logger log = Logger.getLogger(ResultMap.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String callback;

	private Integer state;

	private String message;

	private Object data;

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String toJSONPResponse(String callback) {
		JSONObject json;
		Object dataJson;
		String result = "返回值：";
		try {
			json = new JSONObject();
			dataJson =  JSONObject.toJSON(this.data);
			json.put("state", this.state);
			json.put("message", this.message);
			json.put("data", dataJson);
			result = callback + "(" + new String(json.toString().getBytes("utf-8"),"utf-8") + ")";
			System.out.println("res:"+result);
		} catch (Exception e) {
			log.error("resultmap 转String 失败" + e.getMessage());
			e.printStackTrace();
		}

		return result;
	}
	
	public String toJSONResponse() {
		JSONObject json;
		Object dataJson;
		String result = "返回值：";
		try {
			json = new JSONObject();
			dataJson =  JSONObject.toJSON(this.data);
			System.out.println("data:"+this.data);
			System.out.println("dataJson:"+dataJson);
			System.out.println("dataJsonString:"+dataJson.toString());
			json.put("state", this.state);
			json.put("message", this.message);
			json.put("data", dataJson);
			result = this.callback + "(" + new String(json.toString().getBytes("gbk"),"utf-8") + ")";
			
			
		} catch (Exception e) {
			log.error("resultmap 转String 失败" + e.getMessage());
			e.printStackTrace();
		}

		return result;
	}

}
