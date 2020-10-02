package com.abhijeet.practice.scratch5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Scratch5StepsApplication {

	public static void main(String[] args) {
		
		//what are the beans ?
		//what are the dependencies of a bean?
		//where to search for the beans => No need (same package)
		
//		BinarySearchImpl bSearch = 
//				new BinarySearchImpl(new QuickSortAlgorithm());
		//Application Context
		
		ApplicationContext applicationContext = 
				SpringApplication.run(Scratch5StepsApplication.class, args);
		BinarySearchImpl bSearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bSearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(bSearch);
		System.out.println(bSearch1);
		int result = bSearch.binarySearch(new int[] {12,3,1,36,73, 199}, 36);
		System.out.println(result);
	}

}
