package com.PracticePrograms;

abstract class One{
     public abstract void method1();
     public void method2(){
         System.out.println("I am method 2.");
     }
}

public class AbstractionExample extends One {
    @Override
    public void method1() {
        System.out.println("I am method 1.");
    }

    public static void main(String [] args){

       // One o = new One(); -> can't make objects of abstract class
        AbstractionExample abe = new AbstractionExample();
        abe.method1();
        abe.method2();

    }
}
