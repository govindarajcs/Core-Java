package com.example.autoboxing.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AutoBoxingVarArgExample {
    
    static void m1(Integer x,Integer y){
        System.out.println("Single Argument Constructor");
    }
    
    static void m1(int... x){
        System.out.println("Variable Argument Constructor");
    }
    
    
    public static void main(String[] args) {
        AutoBoxingVarArgExample ab = new AutoBoxingVarArgExample();
        ab.m1(5,7);
        
      
    }
    
}
