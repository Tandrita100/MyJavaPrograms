package com.learningJava;

public class ConditionalOperators {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int max;
       // max = (a < b) ? 5 : 4;    //4
        max = (a < b) ? ((6 < 5) ? 6 : 7) : 4;  //7
        System.out.println(max);

    }
}
