package com.thomas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm() );
		
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(" binarySearch: "+ binarySearch);
		System.out.println("binarySearch1: "+ binarySearch1);
		
		int location = binarySearch.binarySearch(new int[]{12,4,3,5}, 3);
		
		System.out.println("Location is: "+ location);

	}

}
