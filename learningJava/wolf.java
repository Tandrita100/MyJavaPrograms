package com.learningJava;

public class wolf extends dog {

    static void howl(){
        System.out.println("howling...");
    }

    void run(){
        System.out.println("running");
    }
    public static void main(String[] args) {

        wolf w = new wolf();
        w.eat();
        w.walk();
        w.sleep();

        Bark();
        howl();
        w.run();
        w.dig();
    }
}
