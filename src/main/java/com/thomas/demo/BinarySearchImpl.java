package com.thomas.demo;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	/*This is just a fake search just for the purpose of the demo*/
	public int binarySearch(int[] numbers, int numberToSerchFor){
		int index;
		
		//logic to sort the array
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println("sortAlgorithm is: "+ sortAlgorithm);
		
		//logic to search in the array
		index = 2;
		//return the result
		return index;	
	}

}
