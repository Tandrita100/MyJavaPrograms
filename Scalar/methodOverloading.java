package com.Scalar;

public class methodOverloading {
    static int add(int a ,int b){
        System.out.println("Add 2 integers-");
        return a+b;
    }
    static String add(String a ,String b){
        System.out.println("Add 2 strings-");
        return a+b;
    }
    static String add(int a ,String b){
        System.out.println("Add an integer and a string-");
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(6,9));
        System.out.println(add("GOOD"," MORNING"));
        System.out.println(add(50," potatoes"));
    }
}
