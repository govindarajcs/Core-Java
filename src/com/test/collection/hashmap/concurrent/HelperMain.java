package com.test.collection.hashmap.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HelperMain {

    public static void main(String[] args) {
        
        //Map<Employee,Integer> map = new HashMap<Employee,Integer>();
        Map<Employee,Integer> syncMap = new ConcurrentHashMap<Employee,Integer>(10); 
        MapHelper1 help1 = new MapHelper1(syncMap);
        MapHelper2 help2 = new MapHelper2(syncMap);
        MapHelper3 help3 = new MapHelper3(syncMap);
        MapHelper4 help4 = new MapHelper4(syncMap);
        MapHelper5 help5 = new MapHelper5(syncMap);
        for(Map.Entry<Employee,Integer> e: syncMap.entrySet()){
            System.out.println(e.getKey()+" - "+e.getValue());
            
        }
        
    }

}
