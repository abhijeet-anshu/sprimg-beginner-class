package com.abhijeet.practice.scratch5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.abhijeet.practice.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.abhijeet.practice.componentscan")
public class Scratch5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Scratch5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(Scratch5StepsComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		
		LOGGER.info("{}", componentDAO);
		
		
	}

}
