package com.test;

import static com.test.StaticImport.stat;
import static com.test.StaticImport.test;
public class ImportExample {
	
	static{
		//stat = new TestStatic();
		
	}
static void Te(){
	
}
	public static void main(String[] args) {
		//out.println("Test");
		stat.Test();
		ImportExample ie=null;
		ie.Te();
		stat.T();
		test(); // static method can be accessed directly.
	}
}