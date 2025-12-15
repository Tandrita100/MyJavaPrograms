package com.learningJava;

abstract class dog1{
    abstract public void bark();
    abstract public void jump();
}

interface birds1{
    public void fly();
}
class animal extends dog1{

    public void bark(){
        System.out.println("animal is barking");
    }
    public void bark(int a){
        System.out.println("animal is barking with a parameter a");
    }

    public void jump(){
        System.out.println("Dog is jumping");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void eat(int a){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

}

class cat1 extends animal implements birds1 {

    public void fly(){
        System.out.println("flying");
    }

    public void fly(int a){
        System.out.println("flying with a parameter a");
    }
    public void eat(int a) {
        System.out.println("Cat is eating");
    }

    public void sleep(int a){
        System.out.println("cat is sleeping");
    }
}
public class OverridingTest {

    public static void main(String[] args){
        cat1 c = new cat1();
        c.eat();
        c.eat(2);
        c.sleep();
        c.sleep(2);
        c.bark();
        c.bark(5);
        c.jump();
        c.fly();
        c.fly(2);
    }
}
