package com.test.collection.hashmap.concurrent;

public class Employee {
    
    Integer empId;
    String name;
    public Employee(Integer empId, String name) {
        super();
        this.empId = empId;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return empId;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (empId == null) {
            if (other.empId != null)
                return false;
        } else if (!empId.equals(other.empId))
            return false;
        return true;
    }
}
