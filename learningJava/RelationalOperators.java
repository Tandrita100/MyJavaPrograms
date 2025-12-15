package com.learningJava;

public class RelationalOperators {
    public static void main(String[] args){
        int a = 45;
        float b = 53.36f;
        int c = 0;

        // <
        if(a<23){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        // >
        if(b>a){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        // ==
        if(c==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        // !=
        if(c!=a){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        // >=
        if(b>=50){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        // <=
        if(a<=c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        //System.out.println(a>b);

        char x = 'g';
        char y = 'v';
        if(x>y);
        System.out.println("v comes after g.");
    }
}
