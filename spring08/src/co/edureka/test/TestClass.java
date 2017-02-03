package co.edureka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.Hello;



public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello obj=(Hello)context.getBean("hello");		
		obj.sayHello();
		((AbstractApplicationContext)context).registerShutdownHook();
		
	}
	
}
