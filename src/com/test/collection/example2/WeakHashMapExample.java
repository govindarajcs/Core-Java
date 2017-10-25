package com.test.collection.example2;

import java.util.WeakHashMap;

public class WeakHashMapExample {

    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<Employee, String> emp = new WeakHashMap<Employee,String>();
        Employee e = new Employee();
        emp.put(e, "Raj");
        System.out.println("***********");
        System.out.println(emp);
        System.out.println("###########");
        e = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(emp);
    }
}

class Employee{
	String name;
	int id;
	public String toString(){
		System.out.println("I am called when printing the map in console");
		return "temp";
	}
	public void finalize(){
		System.out.println("Calling Finalize method");
	}
}