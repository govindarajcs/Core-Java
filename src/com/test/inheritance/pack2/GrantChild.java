package com.test.inheritance.pack2;

public class GrantChild extends Child{

	
	void get(){
		Child c = new Child();
		//c.add();//The method add() from the type Parent is not visible
		GrantChild gc = new GrantChild();
		gc.add();
		/* gc is the instance of grant child class which is nothing but current class.
		 * Prottected memebrs from another package can be accessed from the Child 
		 * class that to within the same package
		 */  
					 
	}
}
