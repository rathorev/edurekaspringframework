package co.edureka;

import javax.annotation.Resource;

public class B {
	
 
private A a;
 
@Resource(name= "aBean")
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
