package com.learningJava;

public class cat extends animals{

    static void meow(){
        System.out.println("meow meow meow");
    }

    void scratch(){
        System.out.println("scratching..");
    }

    public static void main(String[] args){

        cat c = new cat();
        c.eat();
        c.walk();
        c.sleep();

        meow();
        c.scratch();

    }
}
