package com.test.collection.map.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * 
 * @author Govindaraj_S04
 *  Check is the linked hashmap is fail-fast and also access flag feature...
 */
public class LinkedHashMapUtil {
    
    
    public static void main(String[] args) {
        /*
         * In the LinkedHashMap there is one parameter called access which is a boolean parameter. 
         * If this parameter is set to true then even get call will make the structural modification 
         * on the map and hence will throw concurrent modification exception even for get call while iterating the map.
         * But this is not the case, if access flag is set to false, because normally get() call will not make any 
         * structural modification.  
         */
        
        LinkedHashMap<Employee,String> nameList = new LinkedHashMap<Employee,String>(); //access flag is false by default 
        nameList.put(new Employee(1,21), "Raj");
        nameList.put(new Employee(2,24), "Govind");
        nameList.put(new Employee(3,26), "Sriram");
        nameList.put(new Employee(4,29), "Shankar");
        System.out.println("============================================");
        
        /*
         * Insertion order is preserved and system will not make any concurrent modification exception for get() call.
         */
        System.out.println("Insertion order is preserved...");
        Iterator<Employee> itr = nameList.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(nameList.get(new Employee(2,24)));
            System.out.println("============++++++++++++++++++++++++++++");
            System.out.println(itr.next());
        } 
        System.out.println("============================================");
        
        nameList = new LinkedHashMap<Employee,String>(10,10,true); // initial capacity,load factor and access flag
        nameList.put(new Employee(1,21), "Raj");
        nameList.put(new Employee(2,24), "Govind");
        nameList.put(new Employee(3,26), "Sriram");
        nameList.put(new Employee(4,29), "Shankar");
        /*
         * Insertion order will be affected as the code is going to access the Employee(2,24) and it is going to last which is at second at present.
         */
        nameList.get(new Employee(2,24));
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Insertion order got changed due to get call and access flag is set to true");
        System.out.println(nameList);
        System.out.println("===============================================");
        itr = nameList.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            System.out.println("System will throw concurrent modification exception as access flag is enabled...");
            System.out.println("============++++++++++++++++++++++++++++");
            System.out.println(nameList.get(new Employee(1,21)));
        } 
        
    }
}

class Employee {
    Integer empId;
    String name;
    Integer age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Employee(Integer empId, Integer age) {
        super();
        this.empId = empId;
        this.age = age;
    }
    @Override
    public int hashCode() {
       int id =this.empId;
       int result = 1;
       result = (result * id)+(result  + id);
       return result;
    }
    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Employee){
           Employee emp = (Employee) obj;
           if(emp.empId == this.empId)
               return true;
       }
       return false;
    }
}