package com.hamitmizrak.javasetutorials;

import java.util.Random;
import java.util.Scanner;

public class _12_Examples {
    // Kullanıcı tarafından girilen haftanın gününü bulan algoritma Scanner,Swich ?
    public static void weekDayInUserData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen hafta günü giriniz");
        String weekDay = klavye.nextLine().toLowerCase();
        switch (weekDay) {
            case "pazartesi":
                System.out.println("Pazartesi");
                break;
            case "sali":
                System.out.println("sali");
                break;
            case "carsamba":
                System.out.println("carsamba");
                break;
            case "persembe":
                System.out.println("persembe");
                break;
            case "cuma":
                System.out.println("cuma");
                break;
            case "cumartesi":
                System.out.println("cumartesi");
                break;
            case "pazar":
                System.out.println("pazar");
                break;
            default:
                System.out.println("Lütfen günleri girelim");
                break;
        }
    }

    // Rastgele 5 tane sayının toplamı ,sayılar, kaçtane sayıvar ,kaç tane çift sayı var,çift sayı toplamı ?
    // Exception Handling

    public static void numberResult() {
        int sum = 0, counter = 0, evenCounter = 0, evenSum = 0;
        int commonNumberSum = 0;
        String number = "";
        for (int i = 1; i <= 5; i++) {
            Random random = new Random();
            int numberRandom = random.nextInt(9) + 1;
            number = number + numberRandom + " ";
            counter++;
            if (numberRandom % 2 == 0) {
                evenCounter++;
                evenSum += numberRandom;
            }
            commonNumberSum += numberRandom;
        }
        System.out.println(number);
        System.out.println("Sayı adedi: " + counter + " Bütün sayı toplamları: " + commonNumberSum);
        System.out.println("Çift Sayı adedi: " + evenCounter + " Çift sayı toplamı: " + evenSum);
    }

    // Kullanıcıdan alınan bir sayının faktöriyeli hesaplayan algoritma ?
    // 4!=4*3*2*1=24
    public static void userDataFactoriyel() {
        Scanner klavye = new Scanner(System.in);
        int facNumber = 1;
       /* while(true){}
        for(;;){}*/
        while (true) {
            System.out.println("\nLütfen bir sayı giriniz");
            int number = klavye.nextInt();
            if (number < 0) {
                System.out.println("Sıfırdan küçük sayı girmeyiniz");
                userDataFactoriyel();
            } else if (number == 1 || number == 0) {
                System.out.println("O veya 1 faktöriyel sonuçu: 1");
            } else {
                for (int i = number; i > 0; i--) {
                    facNumber *= i;
                }
                System.out.println(number + " sayısının faktöriyeli: " + facNumber);
                facNumber = 1;
            }
        }
    }

    // Kullanıcıdan alınan bir sayı asal olup olmadığını bulan algoritma ?
    // Asal sayı: sadece 1 ve kendisine bölünebilen sayılardır. 5=1,5(Asal)   50=1,2,5,10,25,50(Asal değildir)

    //örnek: 6 asal sayı değildir(1/2/3/6)
    //En küçük ve tek çift sayı 2'dir
    public static boolean isPrime() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("\nLütfen bir sayı giriniz");
        int number = klavye.nextInt();
        boolean isAsal = true;

        if (number <= 1) {
            System.out.println("2 Küçük asal sayı olamaz");
        } else {
            // 2 3 5 7 11 13 17 19 ... =Asal sayılardır
            //Sayı 2'e bölünüyorsa asal sayı değildir.
            //eğer sayı döngüde bir sayıya bölünüyorsa asal sayı değildir
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    isAsal = false;
            }
            if (isAsal) {
                System.out.println(number + " sayısı Asal Sayıdır.");
            } else {
                System.out.println(number + " sayısı Asal Sayı Değildir");
            }
        }
        return isAsal;
    }

    public static void main(String[] args) {
        for (;;) {
            // weekDayInUserData();
            //numberResult();
            //userDataFactoriyel();

            boolean resutData = isPrime();
            System.out.println(resutData);
        }


        // Vize Final Ödevi
        // kullanıcıdan alınan vize ve final notuna göre geçme(ortalama) Algoritması
        // eğer kullanıcı vize veya final 0(sıfır) bir değer girerse sistemden atsın
        // ekranda "Sifir disiplin hatasi Sistemden cikiliyor"
        // bunun haricinde sürekli vize final sorsun
        // Not Harfleri ==> AA BA BB FF
        // not ortalaması: ortalama<50 altında ise kaldı FF
        //not ortalaması: ortalama==50 Geçti
        // not ortalaması: 55<=x<=69 BB
        // not ortalaması: 70<=x<=84 BA
        // not ortalaması: 85<=x<=100 AA
        // Vize:40% Final:60%
        // Dikkat: Consolda virgül kullanmalısın.
        // while sonsuz döngü   ==> while(true) {}
        // for sonsuz döngü     ==> for(;;) {}

        //faktöriyel recursive olarak algoritmasını yapalım ?

    }
}
