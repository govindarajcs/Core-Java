package com.test.collection.hashmap.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapHelper2 implements Runnable{

    Map<Employee,Integer> map; 
    MapHelper2(Map<Employee,Integer> map){
        this.map = map;
        new Thread(this, "MapHelper2").start();
    }
    
    @Override
    public void run() {
        map.put(new Employee(21,"Govind"), 2);
        try {
            System.out.println("MapHelper2 Class Sleeping ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
    
    

}
