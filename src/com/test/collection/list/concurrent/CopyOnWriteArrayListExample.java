package com.test.collection.list.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        
        List<Integer> l = new CopyOnWriteArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(l.size());        
        System.out.println("================================");
        Iterator<Integer> itr = l.iterator();
        
        while(itr.hasNext()){
            Integer i = itr.next();
            if(i == 2)
                l.add(4);
            else if (i == 3)
                l.add(5);
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(l.size());
        System.out.println("================================");
        for(Integer i : l){
            if(i == 2)
                l.add(7);
            else if (i == 3)
                l.add(8);
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(l.size());
        System.out.println("================================");
    }
}