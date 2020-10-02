package com.abhijeet.practice.scratch5steps.basic.start;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //by default singleton
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	//earlier all mandatory dependencies, use constructor injection
	

	public int binarySearch(int[] numbers, int key)
	{
		//sorting an Array
//		BubbleSortAlgorithm sortAlgo = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//search an Array
		//Return the result
		return 3;
	}
}
