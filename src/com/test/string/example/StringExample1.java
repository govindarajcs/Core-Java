package com.test.string.example;

public class StringExample1 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "HelloWorld";
        String c = "World";
        //c.intern();
        a+=c;
        a=a.intern();
        System.out.println(a==b); // returns true
        
 /**
  *   +--------------------------------------------------------------+
  *   +                                                              +
  *   +                                                              +
  *   +--------------------------------------------------------------+ 
  */
     Integer i = 127;
     Integer j = new Integer(127);
     Integer k=20;
     
     System.out.println(i==Integer.valueOf(j)); //  returns true
     
     String l = "50";
     String x= Integer.toString(10, 2);
     System.out.println(x);
    }
}