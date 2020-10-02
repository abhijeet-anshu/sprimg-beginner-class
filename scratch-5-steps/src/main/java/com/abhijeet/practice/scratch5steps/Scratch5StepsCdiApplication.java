package com.abhijeet.practice.scratch5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhijeet.practice.scratch5steps.cdi.SomeCdiBusiness;

//@SpringBootApplication
@Configuration
@ComponentScan("com.abhijeet.practice.scratch5steps.cdi")
public class Scratch5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Scratch5StepsCdiApplication.class);
	
	public static void main(String[] args) {
		
		
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Scratch5StepsCdiApplication.class))
		{
				//SpringApplication.run(Scratch5StepsCdiApplication.class, args);
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("~~~~~{} dao-{}", business, business.getSomeCdiDao());
		}
		
	}

}
