package com.test.inheritance.example.overloadoverride;

class Animal{
    
}

class Monkey extends Animal{
    
}

class MainClass{
    
    public void m1(Animal a){
        System.out.println("Main class Animal version");
    }
    
    public void m1(Monkey m){
        System.out.println("Main class Monkey version");
    }
    public void execute(){
        Animal a = new Animal();
        Monkey m = new Monkey();
        Animal a1 = new Monkey();
        m1(a);
        m1(m);
        m1(a1);
    }
}

class ChildClass extends MainClass{
    public void m1(Animal a){
        System.out.println("Child class Animal version");
    }
    
    public void m1(Monkey m){
        System.out.println("Child class Monkey version");
    }
    public void execute(){
        Animal a = new Animal();
        Monkey m = new Monkey();
        Animal a1 = new Monkey();
        m1(a);
        m1(m);
        m1(a1);
    }
}

public class OverloadTest extends MainClass{
    
    public static void main(String[] args) {
    ChildClass c = new ChildClass();
    c.execute();
    MainClass m = new MainClass();
    m.execute();
    MainClass c1 = new ChildClass();
    c1.execute();
    }
}