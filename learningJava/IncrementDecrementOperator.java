package com.learningJava;

public class IncrementDecrementOperator {
    public static void main(String[] args){

        int a = 0;
        System.out.println("The value of a is : " + a); // 0
        System.out.println("The value of a++ is : " + a++); // 0 and then it will turn to 1
        System.out.println("The value of a is : " + a);  // 1
        System.out.println("The value of ++a is : " + ++a); // ++1 = 2

        int x = 2;
        int y = 3;
        if((y==x++) | (x<++y)){
            System.out.println("The value of x is : " + x + " and the value of y is : " + y);
        }

    }
}
