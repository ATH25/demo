package com.thomas.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.thomas.demo.basic.cdi.SomeCdiBusiness;




//@SpringBootApplication
@Configuration
@ComponentScan("com.thomas.demo")
public class DemoCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoCdiApplication.class);
	
	public static void main(String[] args) {
		
		try(
//		ApplicationContext applicationContext = SpringApplication.run(DemoCdiApplication.class, args);
		AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(DemoCdiApplication.class);
		){
			SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
		
//			System.out.println( someCdiBusiness+ ", " + someCdiBusiness.getSomeCdiDao() );
			LOGGER.info("* DemoCdiApplication * : someCdiBusiness - {} CdiDao - {}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
		}
		//applicationContext.close();
		
	}

}
