package com.Scalar;

public class methods {

    //meth1
    static void tea(){
        System.out.println("Add tea leaves and sugar in a pot containing water.");
        System.out.println("Add some milk in the water and boil it for a few minutes.");
        System.out.println("Strain it with a sieve and pour in a cup.");
        System.out.println("Enjoy your tea.");
    }
    //meth2
    static void introduction(String name, int age, String [] hobbies){
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My hobbies are:");
        for (String elements:hobbies) {
            System.out.println("*" + elements + ".");
        }
    }
    //meth3
    static void square(int a){      //int to use return
        System.out.println("The square of " + a + " is: " + a*a);
    }
    //meth4
    static String [] heroes(){
        String [] superheroes = {"Ironman", "Thor", "Captain America", "Spiderman"};
        return superheroes;
    }

    public static void main(String[] args) {

    System.out.println("Tea recipe-");
    tea();

    System.out.println();

    System.out.println("Introduction-");
    String [] hobbies = {"Playing quidditch","Reading","Sleeping","Learning Spells"};
    introduction("Harry Potter",20,hobbies);

    System.out.println();

    square(5);
   // System.out.println(square(5));

    System.out.println();
    String [] heroes = heroes();
    for (String hero:heroes){
        System.out.println("#" + hero);
    }
    }
}
