package com.Scalar;

import java.math.BigInteger;

public class bigintegerfactorial {
    public static void main(String[] args) {

        //without using biginteger
        System.out.println("without using biginteger:");
        int a = 5;
        int fact = 1;

        for(int i=1;i<=a;i++){
            fact = fact * i;
        }
        System.out.println(fact);

        System.out.println();

        //using biginteger
        System.out.println("using biginteger");
        int b = 50;
        //int fact2 = 1;
        BigInteger fact2 = new BigInteger("1");

        for(int i=1;i<=b;i++){
            BigInteger aa = new BigInteger(i + "");
            fact2 = fact2.multiply(aa);
        }
        System.out.println(fact2);
    }
}
