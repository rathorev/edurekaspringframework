package co.edureka;

public class Hello {

	
	public void init(){
		System.out.println("I am the init method and I work after bean instantiation");
	}
	
	public void destroy(){
		System.out.println("I am the destroy method and I work just before bean destroyed");
	}
	
	public void sayHello(){
		System.out.println("Hello , Welcome to edureka !!!");
	}
}
