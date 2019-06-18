package com.thomas.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thomas.demo.xml.XMLPersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan("com.thomas.demo")
public class DemoXMLContextApplication {

	 private static Logger LOGGER =
	 LoggerFactory.getLogger(DemoXMLContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class); 

//			System.out.println("DemoXMLContextApplication: BinarySearchImpl : " + xmlPersonDAO);
			LOGGER.info("DemoXMLContextApplication: BinarySearchImpl - {}", xmlPersonDAO);
			LOGGER.info("DemoXMLContextApplication: BinarySearchImpl: getXmlJdbcConnection - {}", xmlPersonDAO.getXmlJdbcConnection() );

		}


	}

}
