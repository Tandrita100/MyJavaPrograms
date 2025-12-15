package com.practice;

import java.util.Random;
import java.util.Scanner;

class Game{

    public int Input;
    public int RanNum;
    public int guess = 0;

    Game(){
        Random ran = new Random();
        RanNum = ran.nextInt(50);
    }

    public int getNoOfGuesses(){
        return Input;
    }

    public void setNoOfGuesses(int n){
        Input = n;
    }

    void takeUserInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number: ") ;
        Input = scan.nextInt();
    }

//    static int isCorrectNumber() {
//        if(Input ){
//
//        }
//    }

}
public class GuessTheNumber {
    public static void main(String[] args) {
    Game g = new Game();



    }
}
