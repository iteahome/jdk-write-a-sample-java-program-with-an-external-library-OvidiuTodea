package com.company;

import org.joda.time.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstWithJoda {

    public static void main(String[] args) {

        String startDate = "01/01/2019 00:00:00";
        String stopDate = "01/01/2020 00:00:00";

        SimpleDateFormat format = new SimpleDateFormat("MM/DD/YYYY HH:MM:SS");

        Date date1 = null;
        Date date2 = null;

        try{
            date1 = format.parse(startDate);
            date2 = format.parse(stopDate);

            DateTime dt1 = new DateTime(date1);
            DateTime dt2 = new DateTime(date2);

            System.out.println("Year 2019 contains: ");
            System.out.println(Days.daysBetween(dt1,dt2).getDays() + " days");
            System.out.println(Hours.hoursBetween(dt1,dt2).getHours() + " hours");
            System.out.println(Minutes.minutesBetween(dt1,dt2).getMinutes() + " minutes");
            System.out.println(Seconds.secondsBetween(dt1,dt2).getSeconds() + " seconds");


        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
