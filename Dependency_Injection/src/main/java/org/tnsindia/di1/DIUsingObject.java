package org.tnsindia.di1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DIUsingObject {

	public static void main(String[] args) {
		//Using IOC
				@SuppressWarnings("resource")
				ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
				Student1 s1=c.getBean("s1",Student1.class);
				s1.cheating();
			
	}

}