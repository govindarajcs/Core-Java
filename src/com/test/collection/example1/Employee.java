package com.test.collection.example1;

public class Employee implements Comparable<Employee> {
	
	
	String name;
	Integer rollNo;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the rollNo
	 */
	public Integer getRollNo() {
		return rollNo;
	}


	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	
	


	public Employee(Integer rollNo,String name) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}


	@Override
	public int compareTo(Employee o) {
		if(this.getRollNo()>o.getRollNo()){
			return 1;
		}else{
			return -1;
		}
		
	}

}
