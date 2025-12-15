package com.JavaPrograms;

//Creating a Thread by Extending Thread class

class Mythread1 extends Thread {      //Thread class is a built-in class
    public void run() {
        int i = 0;
        while(i < 10) {
            System.out.println("skadoooosh.");
            System.out.println("I am dragon master po.");
            i++;
        }
    }
}
class Mythread2 extends Thread {
    public void run() {
        int i = 0;
        while(i < 10) {
            System.out.println("Hi I am mr. Ping");
            System.out.println("I am Father of dragon master po.");
            i++;
        }
    }
}
class Mythread3 extends Thread {
    public void run() {
        int i = 0;
        while(i < 10) {
            System.out.println("I am master shifuu.");
            System.out.println("I am Master of dragon master po.");
            i++;
        }
    }
}
class Mythread4 extends Thread {
    public void run() {
        int i = 0;
        while(i < 10) {
            System.out.println("I am master oogre.");
            System.out.println("I am Master of master shifuu.");
            i++;
        }
    }
}
public class CreatingThreadsMethod1 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        Mythread3 t3 = new Mythread3();
        Mythread4 t4 = new Mythread4();
        t1.start(); // we must use start method to run the methods , we can run all the methods by using only this method.
        t2.start();
        t3.start();
        t4.start();
    }
}
