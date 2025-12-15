package com.learningJava;

public class OperatorOverloaded {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        System.out.println("The sum of a and is " + a+b);

        String c = "Anya";
        String d = " Forger";
        System.out.println(c+d);

        //compound assignment operators
        int x = 2;
        x -= 3*5;  //2-(3*5) = -13
        System.out.println(x);

        int y = 2;
        y *= 5-3;  //2*(5-3) = 4
        System.out.println(y);
    }
}
