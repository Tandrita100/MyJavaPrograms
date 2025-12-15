package com.learningJava;

public class Calculator {

    public int operation(int a, int b, String operation){

        //we will use switch case
        switch(operation){
            case "add" :
                return a+b;
                //System.out.println("The sum of 2 numbers is: "  + a+b );
            case "subtract" :
                return a-b;
            case "multiply" :
                return a*b;
            case "divide" :
                return a/b;
            default :
                System.out.println("Invalid Operation");
                return 0;
        }
    }
    public static void main(String[] args){

        Calculator cal = new Calculator();
        //cal.operation(2,4,"add");
        System.out.println(cal.operation(2,4,"add"));
        System.out.println(cal.operation(21,14,"subtract"));
        System.out.println(cal.operation(2,6,"multiply"));
        System.out.println(cal.operation(222,14,"divide"));

    }
}
