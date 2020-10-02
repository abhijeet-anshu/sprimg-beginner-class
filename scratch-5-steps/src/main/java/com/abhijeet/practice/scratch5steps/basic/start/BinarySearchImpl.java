package com.abhijeet.practice.scratch5steps.basic.start;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //by default singleton
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
	
	@PostConstruct
	public void pt1() {
		logger.info("postConstruct, my method name is not important");
		logger.info("...........getting constructed~~~~~~");
	}
	
	/* does not work unless done the following
	 * https://stackoverflow.com/questions/16373276/predestroy-method-of-a-spring-singleton-bean-not-called
	 */
	@PreDestroy
	public void anyMethodName() {
		logger.info("$$$$$$$$$############$$$$$$$$");
		logger.info("gonna destroy... i can be any method");
		logger.info("you have to call me");
	}
}
