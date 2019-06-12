package com.thomas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.thomas.demo.scope.PersonDAO;

@SpringBootApplication
public class DemoScopeApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm() );
		
		ApplicationContext applicationContext = SpringApplication.run(DemoScopeApplication.class, args);
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		
	}

}
