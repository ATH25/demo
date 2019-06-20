package com.thomas.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.thomas.demo.scope.PersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan
public class DemoScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoScopeApplication.class);
	
	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = SpringApplication.run(DemoScopeApplication.class, args);
		try( AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoScopeApplication.class) ){
			
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("## {}", personDAO);
		LOGGER.info("## {}", personDAO.getJdbcConnection());
		LOGGER.info("## {}", personDAO.getJdbcConnection()); // this returns a different jdbc connection than the above. 
		
		LOGGER.info("## {}", personDAO2);
		LOGGER.info("## {}", personDAO2.getJdbcConnection());
		}
		
	}

}
