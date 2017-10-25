package com.test.collection.hashmap.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapHelper5 implements Runnable{

    Map<Employee,Integer> map; 
    MapHelper5(Map<Employee,Integer> map){
        this.map = map;
        new Thread(this, "MapHelper5").start();
    }
    
    @Override
    public void run() {
        map.remove(new Employee(21,"Govind"));
        try {
            System.out.println("MapHelper5 Class Sleeping ");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
    
    

}
