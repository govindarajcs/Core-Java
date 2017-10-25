package com.test.collection.hashmap;

import java.util.HashMap;

public class HashMapExample1 {

    public static void main(String[] args) {
       
        HashMap<Student,Integer> mapList = new HashMap<Student, Integer>(6,0.5f);
        mapList.put(new Student(1, "Raj"), 25);
        mapList.put(new Student(2,"Govind"), 28);
        mapList.put(new Student(7,"Shankar"), 29);
        mapList.put(new Student(13,"Shyam"), 31);
        
        System.out.println(mapList);
    }
}

class Student{
    Integer id;
    String name;
    
    
    public Student(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
}
