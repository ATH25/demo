package com.thomas.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thomas.demo.xml.XMLPersonDAO;

public class DemoXMLContextApplication {

	 private static Logger LOGGER =
	 LoggerFactory.getLogger(DemoXMLContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class); 
			
			Object[]  beanDefNames = (Object[])applicationContext.getBeanDefinitionNames(); //without type casting this to an array of objects, you will only see one bean. 

//			System.out.println("DemoXMLContextApplication: BinarySearchImpl : " + xmlPersonDAO);
			LOGGER.info("** DemoXMLContextApplication: - {}", xmlPersonDAO);
			LOGGER.info("** DemoXMLContextApplication: getXmlJdbcConnection - {}", xmlPersonDAO.getXmlJdbcConnection() );
			LOGGER.info("** DemoXMLContextApplication: beanDefNames: {}, {}", beanDefNames);// this will display only two objects. 
			LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames()); //without type casting this to an object, you will only see one bean. 
			
		}


	}

}
