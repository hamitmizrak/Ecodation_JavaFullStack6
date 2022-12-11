package com.hamitmizrak.javasetutorials;

import net.bytebuddy.TypeCache;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _14_Date {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getMinutes());
        System.out.println(date.getHours());
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear()+1900);

        long timeMS=System.currentTimeMillis();
        System.out.println(timeMS);
        System.out.println(new Date(timeMS));
        System.out.println(date.getYear()+1900);
        date.setYear(110);
        System.out.println(date.getYear()+1900);

        System.out.println(date.getMonth());
        date.setMonth(0);
        System.out.println(date.getMonth());
        System.out.println("**********************");

        System.out.println("*************************");
        System.out.println(new Date());

        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz",locale);
        Date date1=new Date();
        String dataChange=simpleDateFormat.format(date1);
        System.out.println(dataChange);

    }

}
