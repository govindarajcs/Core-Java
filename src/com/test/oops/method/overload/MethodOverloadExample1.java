package com.test.oops.method.overload;

public class MethodOverloadExample1 {

    public static void main(String[] args) {
        Overload o = null;
        o.m1(5);
        o = new Overload();
        o.m1();
    }
}

class Overload{
    
    public void m1() throws RuntimeException{
        System.out.println("Instance No-Parameterized Overloaded method");
    }
    
    public static void m1(int a){
        System.out.println("Instance Parameterized static overloaded method");
    }
    
}