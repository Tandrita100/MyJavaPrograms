package com.JavaPrograms;

import java.util.*;

public class Calendarclass {
    public static void main(String[] args) {

        //1)Calender.getInstance() is used for implementation of calendar class.
        Calendar c = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));

        //2)getCalendarType() returns the type of the calendar
        System.out.println(c.getCalendarType());

        //3)getTimezone
        System.out.println(c.getTimeZone());

        //4)Timezone.getTimezone
        //for more timezones go to - https://docs.oracle.com/middleware/12211/wcs/tag-ref/MISC/TimeZones.html
        System.out.println(TimeZone.getTimeZone("Asia/Tokyo"));

        //5)getTimeZone().getID()
        System.out.println(c2.getTimeZone().getID());  //Asia/Seoul

        //6)getTimeZone().getDisplayName()
        System.out.println(c2.getTimeZone().getDisplayName());  //Korean Standard Time

        //7)getWeeksInWeekYear()
        System.out.println(c.getWeeksInWeekYear());

        //8)getFirstDayOfWeek()
        System.out.println(c.getFirstDayOfWeek());

        //9)getMinimalDaysInFirstWeek()
        System.out.println(c.getMinimalDaysInFirstWeek());

        //10)getWeekYear()
        System.out.println(c.getWeekYear());

        //11)isWeekDateSupported()
        System.out.println(c.isWeekDateSupported());

        //getMaximum()
        System.out.println(c.getMaximum(Calendar.WEEK_OF_YEAR));

        System.out.println();

        System.out.println("The current year: " + c.get(Calendar.YEAR));
        System.out.println("The current minute: " + c.get(Calendar.MINUTE));
        System.out.println("The current day of month: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("The current hour of day: " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("The current month: " + c.get(Calendar.MONTH));
        System.out.println("The current second: " + c.get(Calendar.SECOND));

        System.out.println();

        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 6);
        System.out.println("After 6 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -10);
        System.out.println("Before 10 years  : "+ c.getTime());
        c.add(Calendar.MONTH,4);
        System.out.println("After 4 months  : "+ c.getTime());

    }
}
