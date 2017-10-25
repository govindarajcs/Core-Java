package com.test.thread;

public class AbstractThread {
    public static void main(String[] args) {
        
        new TestThread();
    }
}


abstract class MyThread{
    
    MyThread(){
        System.out.println("My Thread Class");
    }
    
    void run(){
        System.out.println("Testing abstract Functionality");
    }
}

class TestThread extends MyThread{
    
    TestThread(){
        System.out.println("Test Thread");
    }
}