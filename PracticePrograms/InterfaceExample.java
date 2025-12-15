package com.PracticePrograms;

interface methods{
  //all the methods are abstract implicitly
  public void method1();
  public void method2();
  public void method3();
}
public class InterfaceExample implements methods{
    @Override
    public void method1() {
        System.out.println("This is method 1.");
    }
    @Override
    public void method2() {
        System.out.println("This is method 2.");

    }
    @Override
    public void method3() {
        System.out.println("This is method 3.");

    }

    public static void main(String [] args){
        InterfaceExample ife = new InterfaceExample();
        ife.method1();
        ife.method2();
        ife.method3();
    }
}
