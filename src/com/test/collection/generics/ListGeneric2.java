package com.test.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class ListGeneric2 {

    public static void main(String[] args) {
     
        List<? extends Animal> list = new ArrayList<Dog>();
        //list.add(new Cat()); --> cannot be able to add elements other than null.
        
        List<? super Dog> dogList = new ArrayList<Animal>();
        dogList.add(new Dog()); // cannot add any object other than null, same data type and it's children  
        //dogList.add(new Animal());
        
        //dogList.add(new Animal());
        
        
        
        List<Animal> l1 = new ArrayList<Animal>();
        l1.add(new Animal());
        dogList = l1;
        dogList.add(new Dog());
        for(Object dog : dogList){
            
        }
        
        List<Animal> l =  (List<Animal>) m3(new ArrayList<Animal>());
        Animal c1 = l.get(0);
        List<Cat> catList = m2(new ArrayList<Cat>());
        Cat c = catList.get(0);
        System.out.println(c);
    }
    
    static List<? super Dog> m3(List<? super Dog> dog){
       List<Animal> l = (List<Animal>) dog;
       l.add(new Cat());
       return l;
            
    }
    
    void m1(ArrayList<? extends Animal> l){
        //l.add(new Dog()); --> cannot be able to add elements other than null
        l.add(null);
    }

    static <T extends Animal> ArrayList<T> m2(ArrayList<T> l){
        T e =  (T) new Dog();
        l.add(e);
        System.out.println(l);
        return l; 
    }
    
}


class Animal{
    public void getAnimal(){
        
    }
}

class Dog extends Animal{
    public void getDog(){
        
    }
    
}

class Cat extends Animal{
    public void getCat(){
        
    }
}

class Rat extends Animal{
    public void getCat(){
        
    }
}