package com.test.collection.generics;

import java.util.List;

public class ListGeneric4 {

    public static void main(String[] args) {
    }
}

/*
 * Method overloading is not possible in generics, due to type filter removal.
 */
class A{

    public void m1(List<String> str){
        System.out.println("I am in list String");
    }
    
    public void m1(List<Integer> in){
        
    }
    
}