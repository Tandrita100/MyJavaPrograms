package com.learningJava;

public class dog extends animals{

    static void Bark(){
        System.out.println("bark bark bark");
    }

     void dig(){
        System.out.println("digging hole");
    }

    public static void main(String[] args){

        dog d = new dog();
        d.eat();
        d.walk();
        d.sleep();

        Bark();
        d.dig();

    }
}
