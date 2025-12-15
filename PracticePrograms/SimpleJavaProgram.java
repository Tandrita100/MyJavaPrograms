package com.PracticePrograms;

public class SimpleJavaProgram {
    float a = 6.40076f;
    int a1;
    //static variable
    static String b = "books";
    //method
    public void method(){
        System.out.println("Hello, I am a Method.");
    }
    public static void main(String [] args){
        boolean t = true;
        System.out.println(t);
        //object
        SimpleJavaProgram s = new SimpleJavaProgram();
        System.out.println(s.a);
        s.a1 = 5;
        System.out.println(s.a1);
        s.method();
        System.out.println(b);
    }
}
