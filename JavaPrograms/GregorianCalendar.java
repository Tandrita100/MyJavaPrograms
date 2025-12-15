package com.JavaPrograms;

import java.util.*;

public class GregorianCalendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        //Some other methods are -
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        //syntax -
        GregorianCalendar gc = new GregorianCalendar();
        //System.out.println(gc.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getDefault());


    }
}
