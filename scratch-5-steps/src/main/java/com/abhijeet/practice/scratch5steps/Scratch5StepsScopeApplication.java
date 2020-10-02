package com.abhijeet.practice.scratch5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.abhijeet.practice.scratch5steps.scope.PersonDAO;

@SpringBootApplication
public class Scratch5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Scratch5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(Scratch5StepsScopeApplication.class, args);
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		
	}

}
