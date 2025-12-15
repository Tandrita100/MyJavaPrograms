package com.practice;

class Base{
    Base(){
        System.out.println("This is a constructor");
    }
    Base(String x){
        System.out.println("This is constructor2 with a value " + x);
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("This is constructor3");
    }
    Derived(String x,String y){
        super(x);
        System.out.println("This is constructor4 with a value " + y);
    }
}
class Child extends Derived{
    Child(){
        System.out.println("This is constructor3");
    }
    Child(String x,String y,String z){
        super(x,y);
        System.out.println("This is constructor4 with a value " + z);
    }
}

public class InheritanceConstructors {
    public static void main(String[] args) {
        //Base b = new Base();
        //Base b = new Base("dog");
        //Derived d = new Derived();
        Derived d = new Derived("dog","cat");
        //Child c = new Child();
        Child c = new Child("dog","cat","mouse");

    }
}
