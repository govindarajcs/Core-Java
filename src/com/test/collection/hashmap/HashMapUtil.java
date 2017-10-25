package com.test.collection.hashmap;

import java.util.HashMap;

/**
 * This class defines how the hashcode and equals method is used in put() and get(). 
 * First hashcode is compared and if they are same and then key parameters are compared using equals() ....
 *  
 */
public class HashMapUtil {
    
    public static void main(String[] args) {
        HashMap<Employee,String> map = new HashMap<Employee,String>();
        map.put(new Employee(4, "Sou"), "Test0");
        map.put(new Employee(1, "Raj"), "Test1");        
        map.put(new Employee(4, "Sou"), "Test4");
        map.put(new Employee(3,"Sri"), "Test3");
        map.put(new Employee(2,"Sha"), "Test2");
        System.out.println(map.get(new Employee(4, "Sou")));
        
       /* Iterator<Employee> itr = map.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(map.get(new Employee(4, "Sou")));
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println(itr.next());
        }*/
   }
}

class Employee {
    int empId;
    String name;
    
    public Employee(int empId, String name) {
        super();
        this.empId = empId;
        this.name = name;
    }
    @Override
    public int hashCode() {
        int result = 1;
        for (int i = 0;i<name.length();i++)
            result++;
        return result;
       //return this.empId;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==null)
            return false;
        if (!(obj instanceof Employee))
            return false;
        Employee emp1 = (Employee)obj;
        if (emp1.hashCode() != this.hashCode())
            return false;    
        return true;
    }
    @Override
    public String toString() {
        return "Tested";
    }
}