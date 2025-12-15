package com.learningJava;

public class MyClass {
    int a;
    int b;
    int c;

    public MyClass(){
       // a = 30;
       // b = 45;
        this(45,67,87);
        System.out.println("Constructor 1");

    }

    public MyClass(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor 2");
    }

    public MyClass(int a, int b , int c){
        this(34,45);
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Constructor 3");
    }

    public static void main(String[] args){
        MyClass cl = new MyClass();
        
    }
}
