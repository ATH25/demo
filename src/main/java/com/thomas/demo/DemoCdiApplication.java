package com.thomas.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.thomas.demo.basic.cdi.SomeCdiBusiness;
import com.thomas.demo.scope.PersonDAO;

@SpringBootApplication
public class DemoCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoCdiApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(DemoCdiApplication.class, args);
		
		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
		
		
		LOGGER.info("* DemoCdiApplication * : someCdiBusiness - {} CdiDao - {}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
		
	}

}
