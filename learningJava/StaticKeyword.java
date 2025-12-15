package com.learningJava;

public class StaticKeyword {

    public void meth1(){
        System.out.println("Non-Static method");
        return;   //we can use it but it is not necessary
    }

    public static void main(String[] args){

        StaticKeyword st = new StaticKeyword();
        st.meth1(); //non-static method

        meth2(); //static method

    }

    static void meth2(){
        System.out.println("Static method");
    }
}
