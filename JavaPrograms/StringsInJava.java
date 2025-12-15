package com.JavaPrograms;

public class StringsInJava {
    public static void main(String[] args) {
        String name = new String("Tandrita ");
        System.out.print("My name is ");
        System.out.print(name);

        String lastname = "Baidya";
        System.out.println(lastname);

        String Day = "Saturday";
        System.out.print("Today is ");
        System.out.println(Day);

        //we can also use other things in place of println and print statements to print in java

        String s = "Hello";
        int a = 32;
        float f = 8.6f;
        System.out.printf("%s my name is Tom ,I am %d years old and I am working for about %f years now in IT sector.",s,a,f);
       // System.out.format("\n%s my name is Tom ,I am %d years old and I am working for about %f years now in IT sector.",s,a,f);

        //%d,%f,%s are format specifiers

//        Scanner scan = new Scanner(System.in);
//        System.out.println("\nWho are you?");
//        String st = scan.next();
//        System.out.println(st);
//        String st1 = scan.nextLine();
//        System.out.println(st1);


       //experiment

        String T = "Tom";
        String J = "Jerry";
  //   System.out.println(T,J);
//     System.out.print(T,J);
        System.out.printf("\n%s %s",T,J);
        System.out.printf(T,J);
        System.out.printf(T+J);
//      System.out.print(T);
//      System.out.print(J);


    }
}