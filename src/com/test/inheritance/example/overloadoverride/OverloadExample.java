package com.test.inheritance.example.overloadoverride;

public class OverloadExample {

    public static void main(String[] args) {
        Animal11 an = new Cat();
        an.m1();
    }
}



class Animal11 { 
    public void m1(){
        System.out.println("Default Constructor");
    }
}

class Cat extends Animal11{
    public void m1(int x,int y){
        System.out.println("Parameterized Constructor");
    }
    public void m2(int x){
        System.out.println("Second Method call");
    }
}