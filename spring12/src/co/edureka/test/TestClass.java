package co.edureka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.B;



public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		B b=(B)context.getBean("bBean");
		b.bMethod();
		b.getA().aMethod();
		
	}
	
}
