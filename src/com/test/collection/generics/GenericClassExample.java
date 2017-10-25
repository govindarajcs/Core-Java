package com.test.collection.generics;

enum color {
    RED,BLUE;
}

class Rate<C>{
    
}

class Taxes<C>{
    
}

interface Rentable{
    <C> Rate<C> getRate (Taxes<C> taxes);   
}


interface Developer{
     <C>Rate<C> getRate(Taxes<C> tax);
}

public class GenericClassExample<C> implements Developer,Rentable {

    @Override
    public <C>Rate<C> getRate(Taxes<C> tax) {
        // TODO Auto-generated method stub
        return null;
    }

   

   
}
