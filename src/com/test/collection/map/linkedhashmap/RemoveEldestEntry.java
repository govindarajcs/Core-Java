package com.test.collection.map.linkedhashmap;

import java.util.LinkedHashMap;
/**
 *Program that defines the usage of the removeEldestEntry method. 
 */
public class RemoveEldestEntry {

    public static void main(String[] args) {
        TestHashMap testMap = new TestHashMap();
        /*
         * Extended the LinkedHashmap and override the removeEldestEntry(). 
         */
        testMap.put(1, "Raj");
        testMap.put(2, "Govind");
        testMap.put(3, "Shankar");
        testMap.put(4, "Sriram");
        /*
         * testMap will remove the Entry (1,"Raj" which is added at first, as 
         * it is the Eldest one.
         */
        System.out.println(testMap);
        testMap.get(2);
        testMap.get(3);
        testMap.put(5, "Uma");
        System.out.println(testMap);
    }
}

@SuppressWarnings("serial")
class TestHashMap extends LinkedHashMap<Integer, String>{
    int capacity = 4;
    /*
     * (non-Javadoc)
     * @see java.util.LinkedHashMap#removeEldestEntry(java.util.Map.Entry)
     * Logic defines the maximum number of entries in the map
     */
    TestHashMap(){
        super(10, 10, true);
    }
    /*
     * (non-Javadoc)
     * @see java.util.LinkedHashMap#removeEldestEntry(java.util.Map.Entry)
     * 
     * This method will will the jdk to remove the least accessed entry in the map if it returns true.
     */
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> eldest) {
        return capacity<=this.size();
    }
    
}