package com.JavaPrograms;

import java.time.*; //java.time package for methods of time.


public class TimeAPI {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println();

        //we can also use these methods by creating object of local time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd);

       // for some more methods go to https://www.codewithharry.com/videos/java-tutorials-for-beginners-100/
    }
}
