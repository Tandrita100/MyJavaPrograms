package com.JavaPrograms;

import java.util.Date;

public class Dateclass {
    public static void main(String[] args) {

        //Quiz - to check if it is safe to store System.currentTimeMillis() in long.
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        //it is pretty safe for now but it may cause problems after 292471154.86251205 years from now.(don't ask how i calculated this.)


        System.out.println();

        //Dateclass
        Date d = new Date();

        //Methods of date class
        //1)getTime()
        System.out.println(d.getTime());

        //2)clone()
        System.out.println(d.clone());

        //These methods are depricated.
        System.out.println(d.getDate());

        System.out.println(d.getDay());

        System.out.println(d.getHours());

        System.out.println(d.getMonth());

        System.out.println(d.getMinutes());

        System.out.println(d.getSeconds());

        System.out.println(d.getYear());

        //methods that cn be used now are-
        d.setTime(65);
        System.out.println(d);  //something happened idk what.

        //refer to harry website for more methods and oracle docs

    }
}
