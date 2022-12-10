package com.hamitmizrak.javasetutorials;

import java.util.Random;
//BookMark: NErde kaldığımızı görmek için işaretlemedir. ShortCut: F11
public class _07_Random {
    public static void main(String[] args) {
        //Math
        System.out.println( Math.round(Math.random()*4+1));

        //Random :Object
        Random random=new Random();
        int number=random.nextInt(4)+1;
        System.out.println(number);
    }
}
