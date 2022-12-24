package com.hamitmizrak.fileio;

import java.util.Scanner;

public class PermissionFileServices {

    //field
    private DataFileInformation dataFileInformation;
    private Scanner scanner;
    private Login login;

    //parametresiz constructor
    public PermissionFileServices() {
        dataFileInformation = new DataFileInformation();
        scanner = new Scanner(System.in);
        login = new Login();
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

    //is Login
    private boolean fileIsLogin() {
        boolean result = false;
        String user = login.isLogin().toLowerCase();
        if (user != null && !user.equals("") && !user.isEmpty()) {
            System.out.println(user + " Sistemde birisi var");
            result = true;
        } else {
            System.out.println("Sistemde Böyle bir kullanıcı yoktur");
        }
        return result;
    }

    private void redirectAdminPage(){
        if(fileIsLogin())
            chooiseFile();
        else
            login.isLogin();
    }


    //common Method
    private void chooiseFile() {
        while (true) {
            int chooise = chooiseUser();
            switch (chooise) {
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

                default:
                    System.out.println("Lütfen belirtilen sayıyı giriniz");
                    break;
            }
        }
    }

    // +++++++++++++++++++++++++++++++++
    //FILE CREATE
    private void fileCreate() {
        System.out.println("Dosya oluştur");
    }

    //FILE DELETE
    private void fileDelete() {
        System.out.println("Dosya sil");
    }

    //File Information
    private void fileInformation() {
        System.out.println("Dosya bilgileri");
    }

    //is My Permission
    private void isMyPermission() {
        System.out.println("Benim İznim");
    }

    //FILE PERMISSION
    private void filePermission() {
        System.out.println("Dosya...");
    }

    //Files Names
    private void systemInFilesNames() {
        System.out.println("Dosya isimleri");
    }

    //WRITER
    private void datafileWriter() {
        System.out.println("Dosya yaz");
    }

    //READER
    private void datafileReader() {
        System.out.println("Dosya oku");
    }

    //LOGOUT
    private void logout() {
        System.out.println("Sistemde çıkış");
        System.exit(0);
    }

    //PSVM
    public static void main(String[] args) {
        PermissionFileServices permissionFileServices = new PermissionFileServices();
        permissionFileServices.redirectAdminPage();
    }
}
