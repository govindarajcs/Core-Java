package com.test.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Raj");
        Employee emp2 = new Employee(2, "Raj");
        Employee emp3 = new Employee(3, "Raj");
        Employee emp4 = new Employee(4, "Raj");
        Set<Employee> empSet = new HashSet<Employee>();
        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);
        empSet.add(emp4);
        System.out.println(empSet.size());
        System.out.println(emp1.hashCode());
        emp1.setId(null);
        emp1.setName(null);
        System.out.println(emp1.hashCode());
        System.out.println(empSet);
        
        emp2.setId(null);
        emp2.setName(null);
        emp3.setId(null);
        emp3.setName(null);
        emp4.setId(null);
        emp4.setName(null);
        
        empSet.add(emp1);
        System.out.println(empSet.size());
        
        System.out.println(empSet.remove(emp1));
        System.out.println(empSet.remove(new Employee(4,"Raj")));
        System.out.println(empSet.size());
        
        
    }
        

}

class Employee {
    Integer id;
    String name;
    public Employee(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
