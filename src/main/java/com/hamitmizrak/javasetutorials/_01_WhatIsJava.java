package com.hamitmizrak.javasetutorials;

/*
Yüksek Seviyeli bir programlama dilidir.
OAK
*/
public class _01_WhatIsJava {

    //psvm ==> TAB
    public static void main(String[] args) {
        //String _$degiskenAdi41;
        //String -+~44degiskenAdi;
        String üğşçödegiskenAdi;

        //operatörler
        int number1=20;
        int number2=10;
        //sout ==> TAB
        /*System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2);
        */
        // < <= > >= ! ++ --

        // primitive type
        // stack memory:
        // 8 tane primitive type vardır
        // tamsayılar b s i l
        // -128 <=X<127 2^N
        byte b1=44;
        short s1=130;
        int i1=1551511111;
        long l1=15515111111L;

        // virgüllü sayı
        float f2=1515.45f;
        double d2=15511515.4545445;

        // boolean
        boolean b3=false;

        // karakter
        char c4='@';

        ///////////////////////////////////////////////////////////////
        //wrapper type
        Byte wrapperb1=new Byte((byte) 125);
        Short wrappers1=130;
        Integer wrapperi1=1551511111;
        Long wrapperl1=15515111111L;

        // virgüllü sayı
        Float wrapperf2=1515.45f;
        Double wrapperd2=15511515.4545445;

        // boolean
        Boolean wrapperb3=false;

        // karakter
        Character wrapperc4='@';
    }
}
