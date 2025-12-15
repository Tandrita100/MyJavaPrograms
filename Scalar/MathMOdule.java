package com.Scalar;

public class MathMOdule {
    public static void main(String[] args) {
        int x = Math.max(5,80);
        double y = Math.max(80.8,79.7);
        float u = Math.max(8.8f,8.3f);

        System.out.println("Math methods-");
        System.out.println(x);
        System.out.println(y);
        System.out.println(u);

        System.out.println();
        System.out.println("round offs-");

        double a = Math.floor(3.3);
        double b = Math.ceil(3.3);
        double c = Math.round(3.4);
        double d = Math.round(3.6);
        double e = Math.round(3.5); //4

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println();

        System.out.println("log methods-");
        double E = Math.E;
        System.out.println(E);
        double l = Math.log(E); //E variable not the constant E.
        System.out.println(l);
        double m = Math.log10(100);
        System.out.println(m);

        System.out.println();

        System.out.println("pow method-");
        double n = Math.pow(2,3);
        System.out.println(n);
        double o = Math.pow(5,5);
        System.out.println(o);

        System.out.println();

        System.out.println("sqrt method-");
        double p = Math.sqrt(25);
        System.out.println(p);
        double q = Math.sqrt(100);
        System.out.println(q);

    }
}
