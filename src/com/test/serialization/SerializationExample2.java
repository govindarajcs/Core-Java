package com.test.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationExample2 {
    
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp1 = (Employee) ois.readObject();
        ois.close();
        System.out.println(emp1.age);
        System.out.println(emp1.x);
        System.out.println(emp1.salary);
        System.out.println(emp1.n2);
        System.out.println(emp1.n1);
        System.out.println(emp1.n);
        System.out.println(emp1.n3);
    }
}