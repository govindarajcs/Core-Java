package com.test.collection.list.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Govind");
        nameList.add("Shankar");
        nameList.add("Sriram");
        nameList.add("Prabhu");
        
        ListIterator<String> itr = nameList.listIterator();
        if(itr.hasNext()){
            System.out.println(itr.next());
            //System.out.println(itr.previous());
            itr.remove();
          //  itr.add("Uma");
        }
        System.out.println(nameList);
        
    }

}
