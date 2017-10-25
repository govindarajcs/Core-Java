package com.test.collection.hashmap.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapHelper3 implements Runnable{

    Map<Employee,Integer> map; 
    MapHelper3(Map<Employee,Integer> map){
        this.map = map;
        new Thread(this, "MapHelper3").start();
    }
    
    @Override
    public void run() {
        map.put(new Employee(11,"Shankar"), 3);
        try {
            System.out.println("MapHelper3 Class Sleeping ");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
    
    

}
