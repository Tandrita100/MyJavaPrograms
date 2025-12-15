package com.learningJava;

class AA{
    public void method1(){
        System.out.println("Method");
    }
}


public class ClassA extends AA{
    public void method1(ClassA a){
        System.out.println("Method");
    }

    public void method1(AA b){
        System.out.println("Animal");
    }

    public void method1(int a, int b){
        System.out.println("Animal");
    }



    public static void main(String[] args){
        AA a = new AA();
        AA b = new ClassA();
        a.method1();
        b.method1();
    }
}


