package com.test.thread;

/*
 * Deadlock code
 */

public class YieldJoinExample {

    public static void main(String[] args) throws InterruptedException {
        Thread tMain = Thread.currentThread();
        tMain.setName("MainThread");
        MyThread1 t1 = new MyThread1(tMain);
        t1.start();
        /*
         * Main Thread will wait for the MyThread to Complete
         */
        t1.join();
        System.out.println("I am in parent class");
        
    }
}


class MyThread1 extends Thread{
    
    Thread t1 ;
    
    public MyThread1(Thread t1) {
        this.t1 = t1;
    }
    
    public void run(){
        try {
            System.out.println("I am in Child Class");
            Thread.sleep(5000);
            /*
             * MyThread will wait for the Main thread to complete it's execution.
             */
            
            t1.start();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}