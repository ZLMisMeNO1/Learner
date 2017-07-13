package cn.osbullshit.learner.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerLog {

	private static final Logger log = Logger.getLogger(ControllerLog.class);
	
	@Pointcut(value = "execution(* cn.osbullshit.learner.aop.AopTestController.getStr(java.lang.String)) && args(param)")
	private void AopPointCut(String param){
		log.info("切入点方法AopPointCut["+param+"]");
	}
	
	@After(value="AopPointCut(name)")
	public void after(JoinPoint joinPoint,String name) {
		log.info("after AopPointCut :"+"["+name+"]");
		name += "hello wowowow";
	}

	@Before(value="AopPointCut(name)")
	public void before(JoinPoint joinPoint,String name) {
		log.info("before :["+name+"]");
		//如果需要这里可以取出参数进行处理
		Object[] args = joinPoint.getArgs();
		log.info("通过方法取参："+Arrays.toString(args));
	}
//
	@AfterReturning(pointcut = "AopPointCut(name)", returning = "returnVal")
	public String  afterReturning(JoinPoint joinPoint, Object returnVal,String name) {
		log.info("afterReturning executed, return result is "
				+ returnVal );
		return name;
	}
//
	@Around(value="AopPointCut(name)")
	public void around(ProceedingJoinPoint pjp,String name) throws Throwable {
		log.info("环绕开始");
		try {
			String[] args = new String[]{name};
			Object obj = pjp.proceed(args);
			log.info("环绕执行结果:"+obj);
		} catch (Throwable ex) {
			System.out.println("error in around");
			throw ex;
		}
		log.info("环绕结束");
	}
//
	@AfterThrowing(pointcut = "AopPointCut(name)", throwing = "error")
	public void afterThrowing(JoinPoint jp, Throwable error,String name) {
		log.info("发生错误:"+error);
		log.info("错误信息：" + error.getMessage());
		log.info("错误信息：" + error.getLocalizedMessage());
	}
}
