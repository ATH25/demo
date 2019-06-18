package com.thomas.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.thomas.demo.basic.componentscan.ComponentDAO;
import com.thomas.demo.scope.PersonDAO;

//@SpringBootApplication
//@ComponentScan("com.thomas.demo.basic.componentscan")
@Configuration
@ComponentScan
public class DemoComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoComponentScanApplication.class);
	
	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = 
//				SpringApplication.run(DemoComponentScanApplication.class, args);
		try(
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext
				(DemoComponentScanApplication.class) ) {
		
		ComponentDAO componentDAO = 
				applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("componentDAO - {}", componentDAO);
		}
		
		
	}

}
