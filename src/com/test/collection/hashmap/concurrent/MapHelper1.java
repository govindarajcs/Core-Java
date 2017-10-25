package com.test.collection.hashmap.concurrent;

import java.util.Map;

public class MapHelper1 implements Runnable{

    Map<Employee,Integer> map; 
    MapHelper1(Map<Employee,Integer> map){
        this.map = map;
        new Thread(this, "MapHelper1").start();
    }
    
    @Override
    public void run() {
        map.put(new Employee(1,"Raj"), 1);
        try {
            System.out.println("MapHelper1 Class Sleeping ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
    
    

}
