package org.tnsindia.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans2.xml");

		Collection col = (Collection) ap.getBean("col");
		col.display();

	}

}