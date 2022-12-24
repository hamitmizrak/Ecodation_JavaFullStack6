package com.hamitmizrak.fileio;

import java.util.Scanner;

public class PermissionFileServices {

    //field
    private DataFileInformation dataFileInformation;
    private Scanner scanner;

    //parametresiz constructor
    public PermissionFileServices() {
        dataFileInformation = new DataFileInformation();
        scanner = new Scanner(System.in);
    }

    //common Method
    private int chooiseUser() {
        System.out.println("######## SEÇİM YAPINIZ ###########\n" +
                "    1-) Dosya OLUŞTUR\n" +
                "    2-) Dosya SİL\n" +
                "    3-) Dosya Bilgileri\n" +
                "    4-) Rol bilgimizi öğrenmek\n" +
                "    5-) Dosya izinleri(Rol değiştir sadece admin yapabilir.)\n" +
                "    6-) Sistemede o path bulunan dosya isimlerini göstersin\n" +
                "    7-) Dosya YAZMAK\n" +
                "    8-) Dosya OKUMAK\n" +
                "    9-) Sistemden ÇIKIŞ");
        return scanner.nextInt();
    }

    //common Method
    private void chooiseFile() {
        while (true) {
           int chooise=chooiseUser();
           switch (chooise){
               case 1:
                   fileCreate();
                   break;
               case 2:
                   fileDelete();
                   break;
               case 3:
                   fileInformation();
                   break;
               case 4:
                   isMyPermission();
                   break;
               case 5:
                   filePermission();
                   break;
               case 6:
                   systemInFilesNames();
                   break;
               case 7:
                   datafileWriter();
                   break;
               case 8:
                   datafileReader();
                   break;
               case 9:
                   logout();
                   break;
           }
        }
    }



}
