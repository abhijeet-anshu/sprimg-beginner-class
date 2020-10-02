package com.abhijeet.practice.scratch5steps;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhijeet.practice.scratch5steps.basic.start.BinarySearchImpl;

@Configuration
@ComponentScan("com.abhijeet.practice.scratch5steps")
//@SpringBootApplication
public class Scratch5StepsBasicApplication {

	public static void main(String[] args) {
		
		//what are the beans ?
		//what are the dependencies of a bean?
		//where to search for the beans => No need (same package)
		
//		BinarySearchImpl bSearch = 
//				new BinarySearchImpl(new QuickSortAlgorithm());
		//Application Context
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Scratch5StepsBasicApplication.class))
		{
			performBsearch(applicationContext);
		}
		
		
	}
	
	static void performBsearch(ApplicationContext applicationContext)
	{
		BinarySearchImpl bSearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bSearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(bSearch);
		System.out.println(bSearch1);
		int result = bSearch.binarySearch(new int[] {12,3,1,36,73, 199}, 36);
		System.out.println(result);
	}

}
