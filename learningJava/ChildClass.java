package com.learningJava;

class ParentClass {
    public void eat(int a){
        System.out.println("This is a method in parent class");
    }
}

public class ChildClass extends ParentClass {
    //overloaded
    public void eat(int a, int b){
        System.out.println("This is a method in parent class");
    }

    //overridden
    public void eat(int a){
        System.out.println("This is a method in parent class");
    }

    public static void main(String[] args){
      // super.eat(1);
    }
}
