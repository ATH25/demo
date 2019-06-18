package com.thomas.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.thomas.demo.basic.BinarySearchImpl;

//@SpringBootApplication
@Configuration
@ComponentScan("com.thomas.demo")
public class DemoBasicApplication {
	
	//private static Logger LOGGER = LoggerFactory.getLogger(DemoBasicApplication.class);

	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm() );
		
//		ApplicationContext applicationContext = SpringApplication.run(DemoBasicApplication.class, args);
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoBasicApplication.class) ){
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println("DemoBasicApplication: binarySearch : "+ binarySearch);
		System.out.println("DemoBasicApplication: binarySearch1: "+ binarySearch1);
		
		int location = binarySearch.binarySearch(new int[]{12,4,3,5}, 3);
		
		System.out.println("Location is: "+ location);
		}
		/*when you want to close something after executing a block of code, you can put a try block around it. 
		 * This is a feature of Java 7*/
//		applicationContext.close();

	}

}
