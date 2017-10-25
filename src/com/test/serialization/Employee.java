package com.test.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    Integer id;
    String name;
    final int age;
    final int salary;
    transient final int[] x = {5,4,1};
    transient final String n = new String("Gopal");
    transient final String n1 = "Raj";
    transient final String n2=n1+n1+1;
    transient final String n3=n+n1+1;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    Employee(int id, String name,int age){
        System.out.println("Constructor call");
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=1000;      
    }
}