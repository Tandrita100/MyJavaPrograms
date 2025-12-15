package com.learningJava;

public class ReferenceVariable {

    int a = 20;
    int b = 30;

    public static void main(String[] args){

        ReferenceVariable rv1 = new ReferenceVariable();
        ReferenceVariable rv2 = new ReferenceVariable();

        System.out.println("The value of rv1 a : " + rv1.a + " and value of rv1 b : " + rv1.b);
        System.out.println("The value of rv2 a : " + rv2.a + " and value of rv2 b : " + rv2.b);

        //changing object rv1
        rv1.a = 45;
        rv1.b = 33;

        System.out.println("The value of rv1 a : " + rv1.a + " and value of rv1 b : " + rv1.b);
        System.out.println("The value of rv2 a : " + rv2.a + " and value of rv2 b : " + rv2.b);

        //changing object rv2
        rv2.a = 44;
        rv2.b = 50;

        System.out.println("The value of rv1 a : " + rv1.a + " and value of rv1 b : " + rv1.b);
        System.out.println("The value of rv2 a : " + rv2.a + " and value of rv2 b : " + rv2.b);

        System.out.println();

        //assigning rv1 to rv2
        rv2=rv1;
        System.out.println("change after assigning rv1 to rv2");

        rv1.a = 4321;
        System.out.println("The value of rv1 a : " + rv1.a + " and value of rv1 b : " + rv1.b);

        rv2.b = 9087;
        System.out.println("The value of rv1 a : " + rv2.a + " and value of rv1 b : " + rv2.b);
    }
}
