package com.PracticePrograms;

public class DatatypesAndOperatorsExample {
    public static void main(String [] args){

        boolean boo = true;
        char c = 'c';
        byte b = 44;
        short s = 567;
        int i = 5;
        long l = 6564453434253L;
        float f = 7.9f;
        double d = 6876754674.567444555354246457D;

        System.out.println(boo);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        System.out.println();

        //operations
        System.out.println("operations:");

        //arithmetic
        System.out.println(c+b);
        System.out.println(s*i);
        System.out.println(l/i);
        System.out.println(d/l);
        System.out.println(b%i);

        //relational
        System.out.println(s>b);
        System.out.println(s==d);
        System.out.println(f<l);


        //assignment
        int a = 8;
        System.out.println(a);

        //unary
        int x = 1;
        System.out.println(x++);  //  1  -> x+1 = 2 but prints 1 because it increments after
        System.out.println(x);    //  2
        System.out.println(++x);  //  3  -> x+1 = 3 , x had value 2 so add 1 equals 3

        int y = 1;
        System.out.println(y--);  //  1  -> y-1 = 0 but prints 1 because it decrements after
        System.out.println(y);    //  0
        System.out.println(--y);  //  -1  -> y-1 = -1 , y had value 0 so minus 1 equals -1

        // logical
        int a1 = 5;
        int b1 = 7;
        System.out.println((a1>b1) || (a1<b1));   // true
        System.out.println(a1!=b1);             // true
        System.out.println((a1>b1) && (a1<b1));   // false

        // bitwise
        int a2 = 5;
        int b2 = 7;
        System.out.println(a2|b2);     // 7 -> 0101 | 0111 = 0111
        System.out.println((a2^b2));   // 2 -> 0101 ^ 0111 = 0010
        System.out.println((a2&b2));   // 5 -> 0101 & 0111 = 0111

        // question
        System.out.println((5<3) ^ (4>3));  // true -> 0 ^ 1 = 1

        // conditional
        int t = 5;
        int v = 4;
        int max = (t<v) ? 5 : 4;     // 4
        System.out.println(max);

        int max1 = (6<9) ? 51 : 14;
        System.out.println(max1);    // 51
    }
}
