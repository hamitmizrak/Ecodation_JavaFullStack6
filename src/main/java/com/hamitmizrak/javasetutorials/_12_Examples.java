package com.hamitmizrak.javasetutorials;

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

    public static void main(String[] args) {
        weekDayInUserData();

        // Rastgele 5 tane sayının toplamı , çift sayı adedi,çift sayı toplamı ?


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
