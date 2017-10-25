package com.test.thread;

public class ThreadExample1 {
    static int sleepTime=1000;
    
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo demo = new ThreadDemo();
        demo.sleepTime = 2000;
        demo.start();
        for (int i = 0;i<10;i++){
            Thread.sleep(sleepTime);
            System.out.println(demo.str);
        }
    }

}


class ThreadDemo extends Thread{
    
    int sleepTime; 
    String str = null;
    public void run(){
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(sleepTime);
                str = "I am here";
                System.out.println("In Custom Thread");
                str = null;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
