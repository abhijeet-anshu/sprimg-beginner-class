package com.abhijeet.practice.scratch5steps.basic.start;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	@Override
	public int[] sort(int[] numbers)
	{
		//logic for numbers
		return numbers;
	}
}
