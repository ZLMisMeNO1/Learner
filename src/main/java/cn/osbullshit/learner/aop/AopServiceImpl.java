package cn.osbullshit.learner.aop;

import org.springframework.stereotype.Service;

@Service
public class AopServiceImpl implements AopTestService{

	@Override
	public void getStr() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("getstr");
	}

	@Override
	public String hello(String name) throws Exception {
		// TODO Auto-generated method stub
		return "hello "+name;
	}

	@Override
	public void getError() throws Exception {
		// TODO Auto-generated method stub
		String a = null;
		System.out.println(a.length());
	}

}
