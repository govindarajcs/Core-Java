package com.test.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class ListGeneric {

    public static void main(String[] args) {
        List l = new ArrayList<String>();
        l.add(new String("Govind"));
        l.add(new Integer(10));
        
        System.out.println(l);
    }

}
