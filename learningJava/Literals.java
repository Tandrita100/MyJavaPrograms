package com.learningJava;

public class Literals {

    public static void main(String[] args){

        //decimal literals
        int six = 6;
        System.out.println("decimal literal : " + six);

        int seven = 7;
        System.out.println("decimal literal : " + seven);

        int hundred = 100;
        System.out.println("decimal literal : " + hundred);

        System.out.println();

        //octal literals -> they start with 0
        int ten = 010; //it is an octal integer
        System.out.println("octal literal : " + ten);  // 10 = (1*8pow1) + (0*8pow0) = 8+0 = 8

        int twelve = 012; //it is an octal integer
        System.out.println("octal literal : " + twelve);  // 12 = (1*8pow1) + (2*8pow0) = 8+2 = 10

        int fifteen = 015; //it is an octal integer
        System.out.println("octal literal : " + fifteen);  // 15 = (1*8pow1) + (5*8pow0) = 8+5 = 13

        int sixty = 060; //it is an octal integer
        System.out.println("octal literal : " + sixty);  // 60 = (6*8pow1) + (0*8pow0) = 48+0 = 48

        int oneHundredSixteen = 0116; //it is an octal integer
        System.out.println("octal literal : " + oneHundredSixteen);  // 116 = (1*8pow2) + (1*8pow1) + (6*8pow0) = 64+8+6 = 78

        System.out.println();
        
        //hexadecimal literals -> they start with 0x
        int a = 0x001; //it is a hexadecimal integer
        System.out.println("hexadecimal literal : " + a);

        int b = 0x0000008; //it is a hexadecimal integer
        System.out.println("hexadecimal literal : " + b);

        int b1 = 0x00080; //it is a hexadecimal integer
        System.out.println("hexadecimal literal : " + b1);  // 80 = (8*16pow1) + (0*16pow0) = 128+0 = 128

        int c = 0x8f; //it is a hexadecimal integer
        System.out.println("hexadecimal literal : " + c);  // 8f = (8*16pow1) + (15*16pow0) = 128+15 = 143

        int d = 0x046a; //it is a hexadecimal integer
        System.out.println("hexadecimal literal : " + d);
        /* 46a = (4*16pow2) + (6*16pow1) + (10*16pow0)
               = (4*256) + 96 + 10 = 1130
        */

        System.out.println();

        //Boolean literals
        boolean bool = true;
        System.out.println("boolean literal : " + bool);

        boolean bool2 = false;
        System.out.println("boolean literal : " + bool2);

        System.out.println();

        //floating literals
        float e = 23445.58524554f;
        System.out.println("floating literal : " + e);

        float f = 23445564.58524554f;
        System.out.println("floating literal : " + f);

        System.out.println();

        //double literals
        double g = 735482.438936238648d;
        System.out.println("double literal : " + g);

        double h = 7347585482.438936238648d;
        System.out.println("double literal : " + h);

        System.out.println();

        //long literals
        long i = 35753456585l;
        System.out.println("long literal : " + i);

        long j = 357534565453853676L;
        System.out.println("long literal : " + j);

        System.out.println();

        //char literals
        char k = 'a';
        System.out.println("char literal : " + k);

        char l = 23; //ASCII
        System.out.println("char literal : " + l);

        char m = 345; //ASCII
        System.out.println("char literal : " + m);

        char n = 27; //ASCII
        System.out.println("char literal : " + n);

        char o = '\u004E'; //UNICODE
        System.out.println("char literal : " + o);

        char p = '\u0054'; //UNICODE
        System.out.println("char literal : " + p);

        char q = '\u00C6'; //UNICODE
        System.out.println("char literal : " + q);

        System.out.println();

        //string literal
        String s = "Hello";
        System.out.println("string literal : " + s);

        String t = "I feel good";
        System.out.println("string literal : " + t);




        /*
        byte -    8 bits     1 byte
        short -   16 bits    2 bytes
        int -     32 bits    4 bytes
        long -    64 bits    8 bytes
        float -   32 bits    4 bytes
        double -  64 bits    8 bytes
         */
    }
}
