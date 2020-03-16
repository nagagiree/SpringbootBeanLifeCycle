package io.springboot2.x.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import io.springboot2.x.initilization.BeanLifeCycle;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Autowired
	 private AbstractApplicationContext ctx;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		BeanLifeCycle beanLifeCycle=ctx.getBean("beanLifeCycle",BeanLifeCycle.class);
		beanLifeCycle.getService();
		ctx.registerShutdownHook();
	}
	
}
