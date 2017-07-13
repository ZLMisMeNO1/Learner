/** 
 * Project Name:Learner 
 * File Name:ErrorLog.java 
 * Package Name:cn.osbullshit.learner.log 
 * Date:2017年7月13日下午3:25:15 
 * 
 */  
  
package cn.osbullshit.learner.log;  

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/** 
 * ClassName:ErrorLog  利用aop写3层日志
 * Date:     2017年7月13日 下午3:25:15 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Component
@Aspect
public class ErrorLog {

	private static Logger log = Logger.getLogger(ErrorLog.class);
	
	//日志位置
	private static String ERROR_LOG_LOCATION = null;
	
	//controller 错误日志位置
	private static String CONTROLLER_ERROR_LOG_FILE_LOCATION = null;

	//service 错误日志位置
	private static String SERVICE_ERROR_LOG_FILE_LOCATION = null;
	
	//dao层错误日志位置
	private static String DAO_ERROR_LOG_FILE_LOCATION = null;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
	
	public ErrorLog() {
		Properties prop = null;
		ClassLoader classLoader = null;
		File errorFolder = null;
		try {
			classLoader = getClass().getClassLoader();
			prop = new Properties();
			prop.load(classLoader.getResourceAsStream("error.properties"));
			CONTROLLER_ERROR_LOG_FILE_LOCATION = prop.getProperty("controllerErrorLogLocation","D:\\logs\\runtime\\controllerError.log");
			SERVICE_ERROR_LOG_FILE_LOCATION = prop.getProperty("serviceErrorLogFileLocation","D:\\logs\\runtime\\serviceError.log");
			DAO_ERROR_LOG_FILE_LOCATION = prop.getProperty("daoErrorLogFileLocation","D:\\logs\\runtime\\daoError.log");
			ERROR_LOG_LOCATION = prop.getProperty("errorLogLocation","D:\\logs\\runtime\\");
			errorFolder = new File(ERROR_LOG_LOCATION);
			if(!errorFolder.exists())
				errorFolder.mkdir();
		} catch (Exception e) {
			log.error("获取日志位置失败" + e);
		} 
	}
	
	@AfterThrowing(throwing="e",pointcut="within(cn.osbullshit.learner.controller..*)")
	private void writeControllerError2File(JoinPoint joinPoint,Exception e) {
		StringBuilder sb = new StringBuilder();
		File logFile = null;
		FileWriter fileWriter = null;
		PrintWriter pw = null;
		try {
			logFile = new File(CONTROLLER_ERROR_LOG_FILE_LOCATION);
			if(!logFile.exists())
				logFile.createNewFile();
			fileWriter = new FileWriter(logFile,true);
			pw = new PrintWriter(fileWriter);
			sb.append(sdf.format(new Date()));
			sb.append(joinPoint.toLongString());
			sb.append(" : ");
			sb.append(e);
			pw.println(sb);
			pw.flush();
			pw.close();
		} catch (Exception e1) {
			log.error("controller错误写入文件失败: " + e1);
		} 
		finally {
			try {
				if( null != fileWriter)
					fileWriter.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
	}
	@AfterThrowing(throwing="e",pointcut="within(cn.osbullshit.learner.service..*)")
	private void writeServiceError2File(JoinPoint joinPoint,Exception e) {
		StringBuilder sb = new StringBuilder();
		File logFile = null;
		FileWriter fileWriter = null;
		PrintWriter pw = null;
		try {
			logFile = new File(SERVICE_ERROR_LOG_FILE_LOCATION);
			if(!logFile.exists())
				logFile.createNewFile();
			fileWriter = new FileWriter(logFile,true);
			pw = new PrintWriter(fileWriter);
			sb.append(sdf.format(new Date()));
			sb.append(joinPoint.toLongString());
			sb.append(" : ");
			sb.append(e);
			pw.println(sb);
			pw.flush();
			pw.close();
		} catch (Exception e1) {
			log.error("service错误写入文件失败: " + e1);
		} 
		finally {
			try {
				if( null != fileWriter)
					fileWriter.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
	}
	@AfterThrowing(throwing="e",pointcut="within(cn.osbullshit.learner.dao..*)")
	private void writeDaoError2File(JoinPoint joinPoint,Exception e) {
		StringBuilder sb = new StringBuilder();
		File logFile = null;
		FileWriter fileWriter = null;
		PrintWriter pw = null;
		try {
			logFile = new File(DAO_ERROR_LOG_FILE_LOCATION);
			if(!logFile.exists())
				logFile.createNewFile();
			fileWriter = new FileWriter(logFile,true);
			pw = new PrintWriter(fileWriter);
			sb.append(sdf.format(new Date()));
			sb.append(joinPoint.toLongString());
			sb.append(" : ");
			sb.append(e);
			pw.println(sb);
			pw.flush();
			pw.close();
		} catch (Exception e1) {
			log.error("dao错误写入文件失败: " + e1);
		} 
		finally {
			try {
				if( null != fileWriter)
					fileWriter.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
	}
}
 