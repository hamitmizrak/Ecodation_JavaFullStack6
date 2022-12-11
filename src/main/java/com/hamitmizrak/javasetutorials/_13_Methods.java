package com.hamitmizrak.javasetutorials;

public class _13_Methods {
    // 4 tane metot
    public static void voidliParametresiz() {
        System.out.println("voidli Parametresiz");
    }

    public static void voidliParametreli(String data) {
        System.out.println("voidli Parametreli " + data);
    }

    public static String voidsizParametresiz() {
        return "voidsiz Parametresiz";
    }

    public static String voidsizParametreli(int sayi) {
        return "voidsiz Parametreli "+sayi;
    }

    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("MErhabalar");

        String data1 = voidsizParametresiz();
        System.out.println(data1);

        String data2= voidsizParametreli(44);
        System.out.println(data2);
    }
}
