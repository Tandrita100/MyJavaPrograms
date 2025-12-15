package com.learningJava;

class covariant1{
    public covariant1 method1(){
        System.out.println("This is a method");
        return new covariant1();
    }
}
public class CovariantReturnType extends covariant1 {

     public covariant1 method1(){
        System.out.println("This is method 1");
        return new CovariantReturnType();
    }


    public static void main(String[] args){
        covariant1 c = new covariant1();
        CovariantReturnType cr = new CovariantReturnType();
        c.method1();
        cr.method1();
    }
}
