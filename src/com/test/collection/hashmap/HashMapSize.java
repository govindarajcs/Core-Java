package com.test.collection.hashmap;

import java.util.HashMap;

/*
 * Check if the key doesn't exists which the method returns... 
 */
public class HashMapSize {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
       HashMap<Integer,String> map = new HashMap<Integer,String>(4,0.50f);
       map.put(1, "20");
       map.put(2, "20");
       map.put(3, "20");
       map.put(4, "20");
       map.put(5, null);
       
       System.out.println(map.get(5));

    }
}
