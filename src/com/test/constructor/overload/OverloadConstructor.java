package com.test.constructor.overload;

public class OverloadConstructor {

    public static void main(String[] args) {
        Employee emp = new Employee(10,"Raj");
    }
}


class Department{
    Integer depId;
    String depName;
    Department(){
        System.out.println("Parent Constructor");
    }
    Department(Integer depId,String depName){
        System.out.println("Parent Parameterized Constructor");
    }
}

class Employee extends Department{

    Employee() {
        //super(10,"Raj");
        System.out.println("Child Constructor");
    }
    Employee(Integer depId,String depName){
        
    }
    
    
}