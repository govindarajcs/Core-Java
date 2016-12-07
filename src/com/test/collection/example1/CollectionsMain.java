package com.test.collection.example1;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMain {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2,"Raj")); //Employee class implements comparable interface and hence when Collections.sort() is 
										//getting executed internally compareTo() method is called and data items is getting sorted.
		emp.add(new Employee(3,"Govind"));
		emp.add(new Employee(1,"Shankar"));
		Collections.sort(emp);
		for(Employee empl :  emp){
			System.out.println(empl.getRollNo());
		}
		Collections.reverse(emp);
		for(Employee empl :  emp){
			System.out.println(empl.getRollNo());
		}
	}

}
