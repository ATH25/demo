package com.thomas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm() );
		int location = binarySearchImpl.binarySearch(new int[]{12,4,5}, 3);
		System.out.println("Location is: "+ location);
		
		SpringApplication.run(DemoApplication.class, args);

	}

}
