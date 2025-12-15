package com.JavaPrograms;

public class operators_precedence_associativity {
    public static void main(String[] args) {

        // evaluation of expressions by precedence and associativity

        //Ques1

        int x = 12;
        int y = 4;
        int k = x - y/2;
        System.out.println(k);

        /*
        = 12 - 4/2
        = 12 - 2
        = 10
         */

        //Ques2

        int a = 2;
        int b = 4;
        int c = 6;
        int j =  b*b - 4*a*c/2*a;
        System.out.println(j);

        /*
         = 4*4 - 4*2*6/2*2
         = 16 - 48/2*2
         = 16 - 24*2
         = 16 - 48
         = -32
         */

        int j1 =  b*b - (4*a*c)/(2*a);
        System.out.println(j1);

        /*
        =  4*4 - (4*2*6)/(2*2)
        =  16  - 48/4
        =  16  - 12
        =  4
         */

        //Ques3

        int v = 2;
        int u = 4;
        int l = v*v - u*u;
        System.out.println(l);

        /*
        = 2*2 - 4*4
        = 4 - 16
        = -12
         */

        //Ques4

        int a1 = 5;
        int b1 = 8;
        int d = 4;
        int m = a1*b1-d;
        System.out.println(m);

        /*
        = 5*8-4
        = 40-4
        = 36
         */

    }


}
