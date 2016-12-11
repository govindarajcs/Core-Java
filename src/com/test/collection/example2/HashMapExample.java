package com.test.collection.example2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	/*
	 * In HashMap key is object content not the object hashcode whereas in IdentityHashMap
	 * Key is compared based on hashcode. Although while printing identity hashmap JVM 
	 * will print the content content and value, but we will not be able to fetch the value 
	 * based on object content and will be able to fetch only by object hashcode.  
	 */
	
	public static void main(String[] args) {
		Map<Integer,String> empMap = new HashMap<Integer,String>();
		empMap.put(1, "Govind");
		empMap.put(2, "Raj");
		empMap.put(3,"Shankar");
		/*
		 * In this the key value will be the content of the object. 
		 * Adding to that when we try to put an object in the map, previous value will be 
		 * returned. For example in the below code empMap.put(4,"Sriram") will return null
		 * as the old value will null, and similarly empMap.put(1,"Govi") will return 
		 * Govind which is the old value.
		 */
		System.out.println(empMap.put(4, "Sriram"));
		System.out.println(empMap.put(1, "Govi"));
		System.out.println(empMap);
	}
}