package com.thomas.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.thomas.demo.properties.SomeExternalService;

//@SpringBootApplication
@Configuration
@ComponentScan("com.thomas.demo")
@PropertySource(value = { "classpath:app.properties" }) 
public class DemoPropertiesApplication {
	
	//private static Logger LOGGER = LoggerFactory.getLogger(DemoBasicApplication.class);

	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm() );
		
//		ApplicationContext applicationContext = SpringApplication.run(DemoBasicApplication.class, args);
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoPropertiesApplication.class) ){
		
		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
		
		System.out.println("--&&-- DemoBasicApplication: binarySearch : "+ someExternalService.ReturnServiceUrl());

		}
		/*when you want to close something after executing a block of code, you can put a try block around it. 
		 * This is a feature of Java 7*/
//		applicationContext.close();

	}

}
