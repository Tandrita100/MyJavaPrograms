package com.practice;

class Animal{
    public void eat(){
        System.out.println("come on eat up.");
    }
    public void sleep(){
        System.out.println("go back to sleep.");
    }
}
class Dog extends Animal{
    public void walk(){
        System.out.println("lets go for a walk.");
    }
    public void Bark(){
        System.out.println("bow bow bow.");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Animal A = new Animal(); // it is  allowed
        A.eat();
        A.sleep();

        System.out.println();

        Dog D = new Dog();      // it is allowed
        D.eat();
        D.sleep();
        D.Bark();
        D.walk();

        System.out.println();

        Animal ani = new Dog(); // it is allowed and it is known as Runtime polymorphism.
        ani.sleep();
        ani.eat();
      //ani.walk();  ---> not allowed

        // Dog doggie = new Animal();  ----> it is also not allowed.

    }

}
