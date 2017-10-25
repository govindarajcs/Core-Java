package com.test;

import java.io.PrintStream;

public class StaticImport {
	
	static PrintStream out;
	static TestStatic stat;
	int x;
	
	static void test(){	// this method can be accessed directly in any class if this class is imported as static in any other class 
		System.out.println("Static import Test method");
	}
	
	void test1(){
		System.out.println("Normal method");
		System.out.println(x);
		System.err.println("");
	}
}
