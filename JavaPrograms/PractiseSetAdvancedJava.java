package com.JavaPrograms;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.util.HashSet;

public class PractiseSetAdvancedJava {
    public static void main(String[] args) {

        //Problem1
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Saige Fuentes.");
        Names.add("Bowen Higgins.");
        Names.add("Leighton Kramer.");
        Names.add("Kylan Gentry.");
        Names.add("Amelie Griffith.");
        Names.add("Franklin Sierra.");
        Names.add("Everly Small.");
        Names.add("Rudy Gray.");
        Names.add("Sarah Daniels.");
        Names.add("Xander Rivas.");
        System.out.println(Names);
        for (String elements : Names) {
            System.out.println(elements);
        }

        //Problem2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());  //prints the time in 24h format.

        //Problem3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)); //prints in 12h format.
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)); //prints in 24h format.

        //Problem4
        LocalDateTime d1 = LocalDateTime.now();
        //System.out.println(d1);
        DateTimeFormatter ldt = DateTimeFormatter.ofPattern("hh:mm:ss a"); //12h format
        DateTimeFormatter ldt1 = DateTimeFormatter.ofPattern("HH:mm:ss a"); //24h format
        System.out.println(d1.format(ldt));
        System.out.println(d1.format(ldt1));

        //Problem5
        HashSet<Integer> sss = new HashSet<>();
        sss.add(5);
        sss.add(15);
        sss.add(25);
        sss.add(35);
        sss.add(45);
        sss.add(35);
        sss.add(55);
        System.out.println(sss);












    }
}
