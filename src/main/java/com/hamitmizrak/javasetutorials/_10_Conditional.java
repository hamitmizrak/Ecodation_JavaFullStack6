package com.hamitmizrak.javasetutorials;

public class _10_Conditional {

    public static void main(String[] args) {
        // Conditional
        // Loop
        // Date
        // Method
        // Try-catch

        int number = 9;
        if (number == 1) {
            System.out.println("Sayı 1");
        } else {
            System.out.println("Sayı 1 farklıdır");
        }


        String result=(number == 1) ?"Sayı 1" : "Sayı 1 farklıdır";
        System.out.println(result);

        System.out.println("");
        int sayi = 4;
        if (sayi == 1) {
            System.out.println("Sayı 1");
        } else if (sayi == 2) {
            System.out.println("Sayı 2");
        } else if (sayi == 3) {
            System.out.println("Sayı 3");
        } else if (sayi == 4) {
            System.out.println("Sayı 4");
        } else {
            System.out.println("Sayı 1 den farklıdır");
        }

        System.out.println("");

        switch (sayi) {
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break;
            case 3:
                System.out.println("Sayı 3");
                break;
            case 4:
                System.out.println("Sayı 4");
                break;
            default:
                System.out.println("Sayı 1 den farklıdır");
                break;
        }

    }
}
