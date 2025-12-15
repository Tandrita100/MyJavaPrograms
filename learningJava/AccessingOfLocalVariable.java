package com.learningJava;

public class AccessingOfLocalVariable {

    public static void main(String[] args){
        AccessingOfLocalVariable lb = new AccessingOfLocalVariable();
        lb.localVariable1();
    }

    public void localVariable1(){
        int a = 300;  //local variable
        System.out.println(a);
        localVariable2();
    }

    public void localVariable2(){
        int b = 460;  //local variable
        System.out.println(b);
    }
}
