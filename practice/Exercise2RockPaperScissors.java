package com.practice;
import java.util.Random;
import java.util.Scanner;

public class Exercise2RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 0 for Rock.");
        System.out.println("Enter 1 for Paper.");
        System.out.println("Enter 2 for Scissors.");
        int n = scan.nextInt();

        Random ran = new Random();
        //ComputerChoice
        int CC = ran.nextInt(3);
        System.out.println("The Computer chose " + CC);

        if(n==1 && CC==0 || n==2 && CC==1 || n==0 && CC==2){
            System.out.println("You win, Computer Lose.");
        }
        else{
            System.out.println("Computer win, You Lose.");
        }

    }

}
