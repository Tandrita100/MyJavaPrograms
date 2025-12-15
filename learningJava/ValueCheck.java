package com.learningJava;

public class ValueCheck {

    public static void main(String[] args){

        int a = 3;   //stores the value -> stores the bit pattern  (00000011)
        int b = a;   //copies the bit pattern (00000011)

        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);

        a = 15;

        System.out.println("Updated value of a : " + a);
        System.out.println("The value of b : " + b);

        b = 60;

        System.out.println("The value of a : " + a);
        System.out.println("Updated value of b : " + b);
        
    }
}
