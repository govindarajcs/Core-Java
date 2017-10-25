package com.test.oops.method.overload;

public class OverloadExample3 {

    
    public static void main(String[] args) {
        new Child().run();
        
        new Child().setup();
        System.out.println(new Child().type);
        
        Parent p = new Child();
        System.out.println(p.type);
    }
}

/*
 *  Parent class has type parameter and child class method run() overrides the type parameter defined in the parent class temporarily.
 *  When this.type and super.type is called it refers to type parameter defined in parent class which is overridden by child class in run() and 
 *  hence prints c c
 *  
 *  But if line 34 is uncommented, then the output of this.type and super.type is c a. As this.type is already overridden by child class instance variable 
 *  and that child class instance type parameter is again overridden in run method so this.type will refer to child class instance variable 'type' and 
 *  super.type will refer to parent class instance parameter 'type'.
 *  
 *   Adding to that, child class object holds all the parameter of the parent as well as child class say type parameter of class parent and child will be 
 *   saved in the child class object, so at runtime jvm will fetch the value from child class of parent class type i.i. type of parent as well as child 
 *   will be saved in the child class object.
 */

class Parent{
    String type = "a";
    
    Parent(){
     System.out.println("Parent");   
    }
}

class Child extends Parent{
    //String type = "x";
    Child(){
        System.out.println("Child");
    }
    
    public void run(){
        type = "c";
        System.out.println(this.type+" "+ super.type);
    }
    public void setup(){
        System.out.println(this.type+" "+ super.type);
    }
}

