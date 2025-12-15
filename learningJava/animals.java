package com.learningJava;

public class animals {

    void walk(){
        System.out.println("Walking...");
    }

    void eat(){
        System.out.println("eating...");
    }

    void sleep(){
        System.out.println("sleeping...");
    }

    public static void main(String[] args){

        animals a = new animals();
        a.walk();
        a.eat();
        a.sleep();
        
    }
}
