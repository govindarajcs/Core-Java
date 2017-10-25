package com.test.constructor;

public class ParameterizedConstructor {

    public static void main(String[] args) {
        new Parent(2, 4).test();
    }
}


class Test{
      int y=0;
     Test(){
         y=2;
     }
    public static void m1(){
        System.out.println("I am in Test");
        //System.out.println(y);
    }
}


class Parent{
    Parent(int x, int y){
        super();
        System.out.println("Parent Constructor");
    }
    Test t = null;
    public void test(){
        System.out.println(t);
        t.m1();//Test.m1();
    }
}

class Child extends Parent{
    Child(int x,int y, int z) {
        super(x,y);
    }
}