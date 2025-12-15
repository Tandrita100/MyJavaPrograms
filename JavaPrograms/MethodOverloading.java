package com.JavaPrograms;

public class MethodOverloading {
    static void goo(){
        System.out.println("Hi");
    }

    static void goo(int a){
        System.out.println("Hi " + a + " How are you?");
    }

    static void goo(int a, int b){
        System.out.println("Hi " + a + " How are you?");
        System.out.println("Hi " + b + " How are you?");
    }

    static void change(int a){
        a = 0;
    }
    static void change2(int [] arr){
         arr [1] = 98;
    }
//    static void greetings(){
//        System.out.println("Good Morning Everyone!!!" + "\nHave a nice day." );
//    }

    public static void main(String[] args) {
      //  greetings();

        int x = 45 ;
        change(x);
        System.out.println("The value of x after running change is: " + x);

         int [] marks = {52, 73, 77, 89, 98, 94};
         change2(marks);
         System.out.println("The value of x after running change is: " + marks[1]);
         System.out.println(marks[0]);
         System.out.println(marks[1]);

         //method overloading
         goo();
         goo(3000);
         goo(3000 , 4000);

    }
}
