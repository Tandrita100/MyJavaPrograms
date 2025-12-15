package com.learningJava;

public class bird extends animals{

    static void tweet(){
        System.out.println("tweet tweet tweet");
    }

    void fly(){
        System.out.println("flying..");
    }

    public static void main(String[] args){

        bird b = new bird();
        b.eat();
        b.sleep();

        tweet();
        b.fly();

    }
}
