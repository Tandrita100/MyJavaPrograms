package com.practice;

public class PracticeSetStrings {
    public static void main(String[] args) {

        //Problem1
        String name = "TANDRITA";
        System.out.println(name.toLowerCase());

        System.out.println();

        //Problem2
        String show = "    DARK    ";
        System.out.println(show.replace(" ", "_"));

        System.out.println();

        //Problem3
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "tony"));

        System.out.println();

        //Problem4
        String sentence = "this sentence has   double and    triple spaces";
        System.out.println(sentence.indexOf("  "));
        System.out.println(sentence.indexOf("    "));

        System.out.println();

        //Problem5
        String Letter = "Dear Harry, \nThis Java Course is nice. \nThanks";
        System.out.println(Letter);

    }
}
