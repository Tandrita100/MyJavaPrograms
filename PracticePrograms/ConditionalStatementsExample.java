package com.PracticePrograms;

public class ConditionalStatementsExample {
    public static void main(String [] args){
        int age = 18;

        if (age < 1){
            System.out.println("You do not exist.");
        } else if (age < 18){
            System.out.println("You cannot vote.");
        } else if (age <=100) {
            System.out.println("You can vote.");
        }else if (age > 100){
            System.out.println("You can probably dead.");
        }
    }
}
