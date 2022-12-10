package com.hamitmizrak.javasetutorials;

public class _05_Cast {
    public static void main(String[] args) {

        long l1=155115L;
        float f1=14.5525f;

        byte b2=25;
        int k2=b2;

        long b3=155115L;
        byte k3= (byte) b3;

        //Boxing
        double b4=144.52;
        Double k4=b4;

        //UnBoxing
        Double b5=1414.525;
        double k5=b5;

        //String => Sayı
        String kelime1="12";
        //int sayi0=Integer.valueOf(kelime1); //Object level
        int sayi0=Integer.parseInt(kelime1);  //primitive level
        int sayi1=28;
        System.out.println(kelime1+sayi1);
        System.out.println(sayi0+sayi1);

        System.out.println();

        //Sayı ==> String
        int sayi2=44;
        //String kelime2=String.valueOf(sayi2); //Object level
        String kelime2=Integer.toString(sayi2); //primitive level
        System.out.println(sayi2+16);
        System.out.println(kelime2+16);
    }
}
