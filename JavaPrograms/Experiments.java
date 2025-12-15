package com.JavaPrograms;

public class Experiments {
    public static void main(String[] args) {
        int age = 0;
        do {
            age++;
            System.out.println("Your age is:" + age);
//          System.out.println("Java is great");
            if (age == 18) {
                System.out.println("you are an adult.");
                System.out.println("you can drive now.");
                continue;
                //break;
            }
            // age++;
            //continue;
        } while (age < 25);
        System.out.println("You are a Professional Driver now.");
    }
}

//package com.tandrita;
//
//public class Experiments {
//    public static void main(String[] args) {
//        int age = 0;
//        do {
//            age++;
//            System.out.println("Your age is: " + age);
//            // System.out.println("Java is great");
//            if (age==18){
//                System.out.println("You are an adult.");
//                System.out.println("You can drive now.");
//                continue;
//            }
//            age++;
//        } while (age<=25);
//        System.out.println("You are a Professional Drive now.");
//    }
//}

