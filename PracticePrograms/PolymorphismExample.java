package com.PracticePrograms;

class Animal1{
    public void run(){
        System.out.println("Animal is running.");
    }
    public void eat(){
        System.out.println("Animal is eating.");
    }
}


//inheritance
class Cat1 extends Animal1{
    public void meow(){
        System.out.println("Cat is meowing.");
    }
    public void sleep(){
        System.out.println("Cat is sleeping.");
    }
}

public class PolymorphismExample {
    public static void main(String [] args){
    Animal1 A1 = new Animal1();
    A1.run();
    A1.eat();
    Cat1 C1 = new Cat1();
    C1.meow();
    C1.sleep();
    C1.run();
    C1.eat();
    System.out.println("Polymorphism:");
    Animal1 A2 = new Cat1();
    A2.eat();
    A2.run();
   // A2.meow(); -> animal does not have meow method
   // Cat1 C2 = new Animal1(); -> not possible

}
}
