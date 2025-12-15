package com.Scalar;

public class scopeofavariable {
    public static void main(String[] args) {
        int a = 100;
        if(true){
            a = 1000;
            System.out.println("The value of a is " + a);
        }
        System.out.println("The value of a is " + a);
    }
}
