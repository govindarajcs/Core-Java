package com.test.lang.classs;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		Object obj = new String("Raj");
		Class c = obj.getClass();
		int count=0;
		System.out.println(c.getName()); // print the runtime object. in this case it will print as String(class name). 
		for(Method m : c.getMethods()){
			System.out.println(m.getName());
			count++;
		}
		System.out.println(count);
	}
}