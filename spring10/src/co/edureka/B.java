package co.edureka;

import org.springframework.beans.factory.annotation.Autowired;

public class B {
	
 
 private A a;
 
 @Autowired	
public void setA(A a){
	this.a=a;
}

public A getA(){
	return a;
}

public void bMethod(){
	System.out.println("This is bMethod of class B");
}
  
 
}
