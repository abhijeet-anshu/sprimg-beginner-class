package com.abhijeet.practice.scratch5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	
	private QuickSortAlgorithm()
	{
		
	}
	
	@Override
	public int[] sort(int[] numbers)
	{
		//logic for numbers
		return numbers;
	}
}
