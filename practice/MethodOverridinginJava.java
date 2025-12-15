package com.practice;

class A{
    public void method1(){
        System.out.println("hello i am method 1 of class A");
    }
    public void method2(){
        System.out.println("hello i am method 2 of class A");
    }
}
class B extends A{
    public void method1(){      //Method overriding from class A.
        System.out.println("hello i am method 1 of class B");
    }
    public void method3(){
        System.out.println("hello i am method 2 of class B");
    }
}
public class MethodOverridinginJava {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        B b = new B();
        b.method1();

    }
}
