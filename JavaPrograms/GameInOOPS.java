package com.JavaPrograms;
import java.util.Scanner;
import java.util.Random;
class Game1{
    public int Userinput;
    public int randomNum;

    // Random constructor
    Game1() {
        Random ran = new Random();
        // Generates random integers 0 to 100
        randomNum = ran.nextInt(10);
        System.out.println(randomNum);
    }

    //takeUserInput() for user
    public int getUserinput(){
        return Userinput;
    }

    public void setUserinput(int userinput) {
        Userinput = userinput;
    }
    public int isCorrectNumber(int r ){

        if (Userinput>randomNum){
            System.out.println("To high");
        } else if (Userinput==randomNum) {
            System.out.println("Right");

        } else {
            System.out.println("too low");
        }
        return r;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum() {
        this.randomNum = randomNum;
        //return randomNum;
    }
}

public class GameInOOPS {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number Game");
        Game1 gaming = new Game1();
        Scanner sc = new Scanner(System.in);

        gaming.setUserinput(sc.nextInt());  //user input setter
        System.out.println(gaming.getUserinput());
        System.out.println(gaming.isCorrectNumber(1000));


        //random setter


    }
}