package com.practice;

abstract class Fruit{
    abstract public void color();
    abstract public void taste();
    abstract public void specialfact();
}
class Mango extends Fruit{
    public void fal(){
        System.out.println("About Mango:");
    }
    @Override
    public void color() {
        System.out.println("It is yellow in color.");
    }
    public void taste() {
        System.out.println("It is sweet and a bit sour in taste.");
    }
    public void specialfact() {
        System.out.println("It is known as king of fruits.");
    }
}
class Watermelon extends Fruit{
    public void fal(){
        System.out.println("About Watermelon:");
    }
    @Override
    public void color() {
        System.out.println("It is green on outside and red in inside.");
    }
    public void taste() {
        System.out.println("It is very sweet and watery in taste.");
    }
    public void specialfact() {
        System.out.println("It tastes best if eaten chilled.");
    }
}
class Banana extends Fruit{
    public void fal(){
        System.out.println("About Banana:");
    }
    @Override
    public void color() {
        System.out.println("It is yellow on outside and off-white in inside.");
    }
    public void taste() {
        System.out.println("It is bland and sometimes a bit sweet in taste.");
    }
    public void specialfact() {
        System.out.println("It is good for gut health.");
    }
}
abstract class apple extends Fruit{
    abstract public void fact();          //abstract method in abstract class
}
public class AbstractClassAndMethods {
    public static void main(String[] args) {
        Fruit f = new Mango(); // possible but reverse is not possible (Mango f1 = new  Fruit(); )
        f.color();
       //f.fal() --> not possible because fruit does not have any fal method
       // Fruit f = new Fruit() --> not possible because we cant make objects of abstract class
        Mango M = new Mango();
        M.fal();
        M.color();
        M.taste();
        M.specialfact();

        System.out.println();

        Watermelon W = new Watermelon();
        W.fal();
        W.color();
        W.taste();
        W.specialfact();

        System.out.println();

        Banana B = new Banana();
        B.fal();
        B.color();
        B.taste();
        B.specialfact();
       // apple a = new apple() --> not possible because we cant make objects of abstract class


    }
}
