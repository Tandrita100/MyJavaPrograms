package com.JavaPrograms;
import java.util.Random;
import java.util.Scanner;

class Game {
    public int a;
    public int num;
    public int noofguess = 0;

    public int getNoOfGuesses() {
        return noofguess;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noofguess = noOfGuesses;
    }

//    public Game(){
//        Random random = new Random();
//         a = random.nextInt(10);
//        //System.out.println(a);
//        //return a;
//    }
    public  Game(){
        Random random = new Random();
        // Generates random integers 0 to 100
        a = random.nextInt(100);
    }

    public int takeUserInput(){
        System.out.println("Guess a number:");
      //  Random scan = null;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }

//    void Noofguess(){
//
//    }
    boolean isCorrectNumber() {
    noofguess++;
       if (a < num ) {
           System.out.println("too high");
       } else if (a==num) {
           System.out.format("correct guess "+ " it was %d\nYou guessed it in %d attempts ", num, noofguess);
           return true;
       } else if(a > num){
           System.out.println("too low");
        }
       return false;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        //  Scanner scan = new Scanner(System.in);
        Game number = new Game();
        boolean b = false;
        while (!b) {
            number.takeUserInput();
            b = number.isCorrectNumber();
           //System.out.println(number.a());
            System.out.println(number.a);
          //  number.isCorrectNumber();
        }
    }
}