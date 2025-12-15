package com.JavaPrograms;

public class DateAndTime {
    public static void main(String[] args) {

        //Date in java is stored in the form of a long numer. This long number holds the number of miliseconds passed since 1 jan 1970.
        //Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever We ask it for years passed.
        //System current Time Millis () returns no of milliseconds passed.

        System.out.println(System.currentTimeMillis()); //tells no of milliseconds passed until now.

        System.out.println(System.currentTimeMillis()/1000/3600/24/365); //tells no of years passed since 1970.
        System.out.println(System.currentTimeMillis()/1000/3600/24);
        System.out.println(System.currentTimeMillis()/1000/3600);
        System.out.println(System.currentTimeMillis()/1000);  //converts the time from milliseconds to seconds.
        System.out.println(System.currentTimeMillis()/3600);  //converts the time from seconds to hours.
        System.out.println(System.currentTimeMillis()/24);    //converts the time from hours to days.
        System.out.println(System.currentTimeMillis()/365);   //converts the time from days to years.


        /*
        This Java program seems to be calculating and printing the number of years since the epoch (January 1, 1970).

        System.currentTimeMillis(): This method returns the current time in milliseconds since the epoch.

        / 1000: Dividing by 1000 converts the time from milliseconds to seconds.

        / 3600: Dividing by 3600 converts the time from seconds to hours.

        / 24: Dividing by 24 converts the time from hours to days.

        / 365: Dividing by 365 converts the time from days to years.

        So, the final result of this calculation is the number of years since the epoch, and it's being printed to the console.

        However, keep in mind that this approach has some limitations. It doesn't account for leap years or changes in the length of a day over time,
         */
    }

}
