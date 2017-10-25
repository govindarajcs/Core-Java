package com.test;

public class StringExample {
    
    public static void main(String[] args) {
        String str = new String("Cat").intern();
        String str1 = "Cat";
       // System.out.println(str.hashCode());
        //System.out.println(str1.hashCode());
        //System.out.println(str==str1);
        Calculator c = new Calculator();
        int a=0;
        Integer x = new Integer(10);
        //System.out.println(c.add(a));
        //System.out.println(a);
        System.out.println(c.Add(x));
        System.out.println(x);
    }
}


class Calculator{
    
    int add(int a){
        a  = 7;
        return a;
    }
    
    Integer Add(Integer a){
        a++;
        return a;
    }
}