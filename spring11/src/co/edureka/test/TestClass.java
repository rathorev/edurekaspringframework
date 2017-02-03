package co.edureka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import co.edureka.BoxOffice;



public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		BoxOffice b=(BoxOffice)context.getBean("boxOffice");
		b.currentlyPlaying();
		((AbstractApplicationContext)context).registerShutdownHook();
		
	}
	
}
