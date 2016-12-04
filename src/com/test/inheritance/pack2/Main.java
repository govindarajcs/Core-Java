package com.test.inheritance.pack2;

public class Main {

	public static void main(String[] args) {
		Child c = new Child();
		//c.add(); // The method add() from the type Parent is not visible
		GrantChild gc = new GrantChild();
		gc.get();
		gc.get1(); // this method call is to call the method 
		//in child class of this package which in turn call the protected method of the 
		//parent class in pack1 package.It is feasible because using Child class instance 
		//in the Child class i am calling that method 

	}

}
