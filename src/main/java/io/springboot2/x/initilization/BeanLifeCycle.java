package io.springboot2.x.initilization;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import io.springboot2.x.service.MobileService;

@Service

public class BeanLifeCycle
		implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	@Autowired
	private MobileService service;

	private static final Logger LOGGER = LogManager.getLogger(BeanLifeCycle.class);

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		LOGGER.info("BeanNameAware's setBeanName method...setBeanName(String name) ");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		LOGGER.info(
				"BeanFactoryAware's setBeanFactory method...setBeanFactory(BeanFactory beanFactory) throws BeansException");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		LOGGER.info(
				"ApplicationContextAware's setApplicationContext method...setApplicationContext(ApplicationContext applicationContext) throws BeansException ");
	}

	/*
	 * @Override public Object postProcessAfterInitialization(Object bean, String
	 * beanName) throws BeansException { // TODO Auto-generated method stub
	 * //LOGGER.info(
	 * "After..................................................................................................................."
	 * ); LOGGER.
	 * info("BeanPostProcessor's postProcessAfterInitialization method.............."
	 * ); return BeanPostProcessor.super.postProcessAfterInitialization(bean,
	 * beanName); }
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("InitializingBean's afterPropertiesSet method...afterPropertiesSet() throws Exception");
	}

	/*
	 * @Override public Object postProcessBeforeInitialization(Object bean, String
	 * beanName) throws BeansException { // TODO Auto-generated method stub
	 * //LOGGER.info(
	 * "Before..................................................................................................................."
	 * ); LOGGER.
	 * info("BeanPostProcessor's postProcessBeforeInitialization method..............."
	 * ); return BeanPostProcessor.super.postProcessBeforeInitialization(bean,
	 * beanName); }
	 */
	@PostConstruct
	public void setUp() {
		LOGGER.info("Custom init method...Specific to bean initilization logic");
	}

	public void getService() {
		LOGGER.info(service.toString());
	}

	@PreDestroy
	public void tearDown() {
		LOGGER.info("Custom destroy method...Specific to bean destroy logic");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("DisposableBean's destroy method...destroy() throws Exception");
	}

}