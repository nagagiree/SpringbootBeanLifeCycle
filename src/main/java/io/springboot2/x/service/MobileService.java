package io.springboot2.x.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.springboot2.x.initilization.BeanLifeCycle;



@Service
public class MobileService {
	private static final Logger LOGGER = LogManager.getLogger(BeanLifeCycle.class);
	@Value("${mobile.id}")
	private Integer serviceId;
	@Value("${mobile.model}")
	private String model;
	@Value("${mobile.name}")
	private String regName;

	@Override
	public String toString() {
		LOGGER.info("Now..,The Bean is ready to provide service...");
		return "MobileService [serviceId=" + serviceId + ", model=" + model + ", regName=" + regName + "]";
	}

}
