package com.test.collection.example2;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		IdentityHashMap<Integer, String> identity = new IdentityHashMap<Integer,String>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		identity.put(i1, "Govind");
		identity.put(i2, "Raj");
		/*
		 * In the identity map, the key is object hashcode. Although the key is printed as 
		 * 10, the actual key value will be hashcode. If we try to do identity.get(10) it 
		 * will return null  
		 */
		System.out.println(identity);
		String s = identity.get(10); 
		System.out.println(s); //null
		System.out.println(identity.get(i1));
	}

}
