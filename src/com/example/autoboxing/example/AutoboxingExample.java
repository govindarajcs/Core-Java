package com.example.autoboxing.example;

public class AutoboxingExample {

	public static void main(String[] args) {
		Integer i = null ;
		int x = i;
		/*
		 *  null pointer exception will be thrown as the line int x = i will internally 
		 *  call the i.parseInt() method, but x is null so jvm will throw null pointer 
		 *  exception.
		 */
		System.out.println(x); 
		int y = 0;
		/*
		 * for the line Integer z = y, internally jvm will call the method Integer.valueOf(y) 
		 * and return the wrapper to the variable z.
		 */
		Integer z = y;
		System.out.println(z);
	}
	
}
