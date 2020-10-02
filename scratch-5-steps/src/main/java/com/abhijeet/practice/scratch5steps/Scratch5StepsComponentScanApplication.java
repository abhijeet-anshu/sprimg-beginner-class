package com.abhijeet.practice.scratch5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhijeet.practice.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.abhijeet.practice.componentscan")
public class Scratch5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Scratch5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Scratch5StepsComponentScanApplication.class))
		{
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);
		}
		
	}

}
