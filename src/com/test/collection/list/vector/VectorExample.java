package com.test.collection.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


/**
 * Vector example
 *  
 */

public class VectorExample {
    
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Govind");
        v.addElement("Raj");
        v.add(1, "Shankar");
        v.add(1, "Sriram");
        v.add("Uma");
        /*
         * Enumeration will not handle 
         * concurrent modification exception like iterator. So Enumeration is always used to iterate the synchronized collection lists.
         * although nextElement() is synchronized but will allow structural modification. 
         */
        Enumeration<String> en = v.elements();
        int count =0;
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
            v.add("Sairam");
            if(count==7)
                break;
            count++;
        }
        /*
         * Iterator will throw concurrent modification exception
         */
        Iterator<String> it = v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            v.add("Test");
        }
    }
}
