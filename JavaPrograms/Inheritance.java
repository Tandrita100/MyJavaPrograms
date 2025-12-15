package com.JavaPrograms;

class Base{
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        System.out.println("mai hu gian");
        this.a = a;
    }
}

class Derived extends Base{
    public int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

//class derived2 extends Derived{
//    public int b1;
//}

public class Inheritance {
    public static void main(String[] args) {

        //object for base
        Base b = new Base();
        b.setA(50);
        System.out.println(b.getA());

        //object for derived
        Derived d = new Derived();
        d.setC(100);
        System.out.println(d.getC());
        b.setA(500);
        System.out.println(b.getA());


    }
}



