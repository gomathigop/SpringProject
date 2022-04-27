package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//load the spring.xml file
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	         Student sob= (Student) context.getBean("studentob");
	         sob.display();
		}

	


	}


