package com.thomas.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort (int[] numbers){
		//logic for quick sort
		return numbers;
	}
}
