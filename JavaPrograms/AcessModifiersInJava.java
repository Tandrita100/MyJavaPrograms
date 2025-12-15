package com.JavaPrograms;

class C{
    public int a = 14;
    protected int b = 58;
    int c = 73;
    private int d = 900;
    public void method1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AcessModifiersInJava {
    public static void main(String[] args) {
        C ccc = new C();
        ccc.method1();
        System.out.println();
        System.out.println(ccc.a);
        System.out.println(ccc.b);
        System.out.println(ccc.c);
        //System.out.println(ccc.d); --> not accessible (private)
    }

}
