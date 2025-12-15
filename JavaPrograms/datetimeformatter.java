package com.JavaPrograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {

        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy H:m a E");
        String s = ld.format(dtf);
        System.out.println(s);

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String d = ld.format(dtf2);
        System.out.println(d);

        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_ORDINAL_DATE;
        String d2 = ld.format(dtf3);
        System.out.println(d2);

        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_WEEK_DATE;
        String d4 = ld.format(dtf4);
        System.out.println(d4);

//        DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT;
//        String d5 = ld.format(dtf5);
//        System.out.println(d5);
//
//        DateTimeFormatter dtf6 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
//        String d6 = ld.format(dtf6);
//        System.out.println(d6);

        //for more info about datetimeformatter go to - https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/time/format/DateTimeFormatter.html

    }
}
