package com.Scalar;

public class trigonometryMethods {
    public static void main(String[] args) {

        //NOTE : the answers are not accurate and show a little bit of error

        final double PI = Math.PI;
        System.out.println(PI);

         // System.out.println(Math.PI);

        System.out.println("sin method-");
        double i = Math.sin(PI/6);
        System.out.println(i);
        System.out.println(Math.floor(i));
        System.out.println(Math.round(i));
        System.out.println(Math.ceil(i));

        System.out.println();
        System.out.println(Math.sin(0));

        System.out.println();
        System.out.println("cos method-");
        System.out.println(Math.cos(PI/3));
        System.out.println(Math.cos(0));

        System.out.println();
        System.out.println("tan method-");
        System.out.println(Math.tan(PI/4));
        System.out.println(Math.tan(0));




    }
}
