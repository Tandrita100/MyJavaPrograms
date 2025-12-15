package com.Scalar;

import java.math.BigInteger;

public class bigInteger {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("500000000000000000000000000000000");
        BigInteger b = new BigInteger("100000000000000000000000000000000");

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.subtract(b));
        System.out.println(a.divide(b));
        System.out.println(a.max(b));
        System.out.println(a.min(b));
        System.out.println(a.pow(2));
        System.out.println(a.mod(b));

        System.out.println();

        //conversions

        //coverting int to biginteger
        int x = 55;
        //BigInteger x1 = new BigInteger(x);  ----> gives an error
        BigInteger x1 = new BigInteger(x + "");  //typecasting to string by concatenating with a string
       // BigInteger x1 = new BigInteger(x + "" + x);  //typecasting to string by concatenating with a string
        System.out.println(x1);

        //coverting biginteger to int
        BigInteger y1 = new BigInteger("56868");
        int z1 = y1.intValue();
        System.out.println(z1);

        BigInteger y = new BigInteger("567587578587878787879797979979079786867857857575");
        int z = y.intValue();
        System.out.println(z);

        BigInteger y2 = new BigInteger("567587578587878787");
        long z2 = y2.longValue();
        System.out.println(z2);

        BigInteger k = new BigInteger("567587578587878787879797979979079786867857857575");
        float l = k.floatValue();
        System.out.println(l);

    }
}
