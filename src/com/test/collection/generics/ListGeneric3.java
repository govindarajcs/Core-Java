package com.test.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class ListGeneric3 {

    public static void main(String[] args) {
        List<?> l = new ArrayList<String>();
        l.add(null);
        List<Integer> i = new ArrayList<Integer>();
        i.add(1);
        l=i;
        
    }
}