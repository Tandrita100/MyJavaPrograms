package com.learningJava.Numericals;

public class OddEven {

    static void CheckEvenOdd(int a){
        if((a&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String [] args){
        CheckEvenOdd(78);
        CheckEvenOdd(17);
        CheckEvenOdd(64);
        CheckEvenOdd(713);
        CheckEvenOdd(50);
        CheckEvenOdd(89);
        CheckEvenOdd(63);
    }
}
