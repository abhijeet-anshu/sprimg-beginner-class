package com.abhijeet.practice.scratch5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhijeet.practice.scratch5steps.basic.scope.PersonDAO;

@Configuration
@ComponentScan("com.abhijeet.practice.scratch5steps")
public class Scratch5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Scratch5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		
		
		try(AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(Scratch5StepsScopeApplication.class))
		{
			//applicationContext.refresh();
			PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
			
			PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
				
			LOGGER.info("{}", personDao2);
			LOGGER.info("{}", personDao2.getJdbcConnection());
		}
		
	}

}
