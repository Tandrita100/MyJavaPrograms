package com.PracticePrograms;

class Animal{
   public void run(){
       System.out.println("Animal is running.");
   }
}

//inheritance
class Cat extends Animal{
    public void meow(){
        System.out.println("Cat is meowing.");
    }
}

public class InheritanceExample {
    public static void main(String [] args){
        Animal A = new Animal();
        A.run();
        Cat C = new Cat();
        C.meow();
        C.run();
    }
}
