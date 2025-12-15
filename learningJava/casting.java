package com.learningJava;

public class casting {

    public static void main(String[] args){

        //implicit casting -> compiler does it
        byte b = 127;
        System.out.println("The value of b : " + b);

        //byte b1 = 128;
        //System.out.println(b1); // will through an error due to possible loss of precision

        //explicit casting -> we do it
        byte b1 = (byte)128;
        System.out.println("The value of b1 : " +b1);

        //expression casting
        byte c = 3;
        byte d = 4;
        //byte e = c+d;  -> throws an error due to possible loss of precision
        byte e = (byte)(c+d);  //implicitly casting
        System.out.println("The value of e : " + e);

        /* short */
        short s = 5635;
        System.out.println("The value of s : " + s);
        //short s1 = 56355;  -> throws an error due to possible loss of precision
        short s1 = (short)56543;     //implicitly casting
        System.out.println("The value of s : " + s1);


        /* float */
        float f = 108643846876.864763745347f;
        System.out.println("The value of f : " + f);
        //float f1 = 1892367674686.7853767523574;  -> throws an error due to possible loss of precision
        float f1 = (float)1674686.7853767523574;  //implicitly casting
        System.out.println("The value of f1 : " + f1);


        /* long */
        long l = 127;
        System.out.println("The value of l : " + l);
        long l1 = 6754676766665343452L;
        System.out.println("The value of l : " + l);


        /* int */
        int i = 373257573;
        System.out.println("The value of i : " + i);
        //int i1 = 637684765864;  -> throws an error due to possible loss of precision
        //int i1 = (int)23768477578;

        float fl = 3546537.7465835f;
        int i2 = (int)fl;
        System.out.println("The value of i1 : " + i2);


        /* double */
        double db = 83678636473547527643.7894386386868236846826482368d;
        System.out.println(db);

    }
}
