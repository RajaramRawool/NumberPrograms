package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Temp {


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date=  new Date();
        calendar.set(2015,7,5);
        System.out.println(calendar.getTime());
        String dayWeekText = new SimpleDateFormat("EEEE").format(calendar.getTime());
        System.out.println(dayWeekText.toUpperCase());


    }
}
