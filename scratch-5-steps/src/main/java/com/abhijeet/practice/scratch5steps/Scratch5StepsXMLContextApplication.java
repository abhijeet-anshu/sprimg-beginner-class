package com.abhijeet.practice.scratch5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhijeet.practice.scratch5steps.xml.XmlJdbcConnection;
import com.abhijeet.practice.scratch5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.abhijeet.practice.scratch5steps")
//@SpringBootApplication
public class Scratch5StepsXMLContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(Scratch5StepsXMLContextApplication.class);
	public static void main(String[] args) {
		
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getXmlJdbcConnection());
		}
		
		
	}

}
