package com.learningJava;

public class Summation {

    public static void main (String[] args){
        int n = 5;
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("sum is : " + sum);
    }
}
