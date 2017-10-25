package com.test.inheritance.example.overloadoverride;

/**
 * Class to check is variable arguments dominates the child class-parent class implicit type-casting. But it is vice-versa.
 *    
 */

public class OverloadExample2 {
    
    public static void main(String[] args) {
        /*
         * m1(Object a, String b) method is getting called as variable arguments method signature is
         * least considered i.e. variable argument methods are least prioritized. 
         */
        m1(new String(),new String());
        
        /*
         * This method will throw compile time error as the method m1(null) is ambiguous with 2 defined 
         * methods namely m1(String a) and StringBuffer(String b1) 
         */
       // m1(null);
    }
    public static void m1(StringBuffer b1){
        System.out.println("String buffer method");
    }
    public static void m1(String a){
        System.out.println("String Single Parameterized Variable");
    }
    public static void m1(String...a){
        System.out.println("String array");
    }
    public static void m1(Object a, String b){
        System.out.println("String and Object variable");
    }
}