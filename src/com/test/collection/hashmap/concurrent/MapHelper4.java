package com.test.collection.hashmap.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapHelper4 implements Runnable{

    Map<Employee,Integer> map; 
    MapHelper4(Map<Employee,Integer> map){
        this.map = map;
        new Thread(this, "MapHelper4").start();
    }
    
    @Override
    public void run() {
        map.put(new Employee(4,"Sriram"), 4);
        try {
            System.out.println("MapHelper4 Class Sleeping ");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
    
    

}
