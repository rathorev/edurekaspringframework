package co.edureka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.Welcome;



public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Welcome obj=(Welcome)context.getBean("obj");
		obj.setMessage("Welcome to edureka !!!");
		System.out.println(obj.getMessage());
		
		obj=(Welcome)context.getBean("obj");
		System.out.println(obj.getMessage());
		
	}
	
}
