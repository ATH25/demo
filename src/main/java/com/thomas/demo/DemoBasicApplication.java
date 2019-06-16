package com.thomas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.thomas.demo.basic.BinarySearchImpl;

@SpringBootApplication
public class DemoBasicApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm() );
		
		ApplicationContext applicationContext = SpringApplication.run(DemoBasicApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println("DemoBasicApplication: binarySearch: "+ binarySearch);
		System.out.println("DemoBasicApplication: binarySearch1: "+ binarySearch1);
		
		int location = binarySearch.binarySearch(new int[]{12,4,3,5}, 3);
		
		System.out.println("Location is: "+ location);

	}

}
