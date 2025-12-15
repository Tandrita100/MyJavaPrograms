package com.JavaPrograms;

interface father{
    void method1();
    void method2();
}

interface Child extends father{
    void method3();
    void method4();
}

class son implements Child{
    public void method1() {
        System.out.println("this is method 1");
    }
    public void method2() {
        System.out.println("this is method 2");
    }
    public void method3() {
        System.out.println("this is method 3");
    }
    public void method4() {
        System.out.println("this is method 4");
    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
        son s = new son();
        s.method1();
        s.method2();
        s.method3();
        s.method4();
    }
}
