package co.edureka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.Student;

public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student)context.getBean("student");		
		System.out.println( student.getName()+" "+student.getHostel().getHostelName());
		
	}
	
}
