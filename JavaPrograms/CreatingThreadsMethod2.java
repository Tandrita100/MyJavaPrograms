package com.JavaPrograms;

//Creating a Java Thread Using Runnable Interface

class Myrunnable1 implements Runnable{
    public void run(){
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
        System.out.println("Hi!!!!");
    }
}
class Myrunnable2 implements Runnable{
    public void run(){
        System.out.println("Bye:)");
        System.out.println("Bye:)");
        System.out.println("Bye:)");
        System.out.println("Bye:)");
        System.out.println("Bye:)");
        System.out.println("Bye:)");
        System.out.println("Bye:)");
        System.out.println("Bye:)");
        System.out.println("Bye:)");
        System.out.println("Bye:)");
    }
}
public class CreatingThreadsMethod2 {
    public static void main(String[] args) {
        Myrunnable1 r1 = new Myrunnable1();
        Thread t1 = new Thread(r1);  //it is necessary to add to implement the runnable thread

        Myrunnable2 r2 = new Myrunnable2();
        Thread t2 = new Thread(r2);

        t1.start(); //this won't work without the creation of object above.
        t2.start();
    }
}
