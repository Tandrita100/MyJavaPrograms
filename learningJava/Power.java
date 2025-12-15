package com.learningJava;

public class Power {
    public double powerOfNumbers(int a, int b){

        /*
        //inbuilt method in java and it only works with double.
        double power = Math.pow(a,b);
        return power;
         */

         if (b==0){
             return 1;
         }

         double result = 1;  //initially the result will be 1
         boolean isNegative = b < 0;

         return 0;
    }
    public static void main(String[] args){
        Power p = new Power();
        System.out.println(p.powerOfNumbers(5,2));
    }
}
