package com.abhijeet.practice.scratch5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.abhijeet.practice.scratch5steps.cdi.SomeCdiBusiness;

@SpringBootApplication
@ComponentScan("com.abhijeet.practice.scratch5steps.cdi")
public class Scratch5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Scratch5StepsCdiApplication.class);
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(Scratch5StepsCdiApplication.class, args);
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());
		
		
	}

}
