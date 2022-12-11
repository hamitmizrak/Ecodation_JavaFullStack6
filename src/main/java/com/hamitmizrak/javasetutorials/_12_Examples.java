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

    // Kullanıcıdan alınan bir sayının faktöriyeli hesaplayan algoritma ?
    // 4!=4*3*2*1=24

    // Kullanıcıdan alınan bir sayı asal olup olmadığını bulan algoritma ?
    // Asal sayı: sadece 1 ve kendisine bölünebilen sayılardır. 5=1,5(Asal)   50=1,2,5,10,25,50(Asal değildir)

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

    public static void main(String[] args) {
        // weekDayInUserData();
        numberResult();


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

    }
}
