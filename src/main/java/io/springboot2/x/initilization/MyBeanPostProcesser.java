package io.springboot2.x.initilization;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service

public class MyBeanPostProcesser implements BeanPostProcessor {

	private static final Logger LOGGER = LogManager.getLogger(MyBeanPostProcesser.class);

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub

		LOGGER.info("BeanPostProcessor's postProcessAfterInitialization method................");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub

		LOGGER.info("BeanPostProcessor's postProcessBeforeInitialization method................");
		return bean;
	}

}
