package com.learningJava;

public class StringConcatenation {
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        String s = "Monday" + a + b; //monday23
        System.out.println(s);
        String s1 = a + b + "Monday"; //5monday
        System.out.println(s1);
    }
}
