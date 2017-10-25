package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Serialization concept to check the hashcode and equals object
 */
public class SerializationExample1 {
    
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(1,"Raj",32);
        System.out.println(emp.n);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Serialization");
        oos.writeObject(emp);
        oos.close();
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("Deserialization");
        Employee emp1 = (Employee) ois.readObject();
        ois.close();
      //  System.out.println(emp1==emp);
       // System.out.println(emp.hashCode());
       // System.out.println(emp1.hashCode());
    }
}