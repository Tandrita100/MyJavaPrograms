package com.Scalar;

public class callstack {
    static void first(){
        int x = 25;
        System.out.println("The value of X is: " + x);
        second();
    }
    static void second(){
        int x = 45;
        System.out.println("The value of X is: " + x);
        third();
    }
    static void third(){
        int x = 65;
        System.out.println("The value of X is: " + x);
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of X is: " + x);
        first();
    }
}
