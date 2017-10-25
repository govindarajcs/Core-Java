package com.test.oops.method.overload;

public class OverloadExample2 {

    public static void main(String[] args) {
        AutomaticPromotion ap = new AutomaticPromotion();
        //ap.m1('a', 5); -- > 
    }
}
class AutomaticPromotion{
    
    public void m1(double d, float f){
        System.out.println("Test double-float automatic promotion");
    }
    
    public void m1(float d, double f){
        System.out.println("Test float-double automatic promotion");
    }
}