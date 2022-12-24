package com.hamitmizrak.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PermissionFileServices {

    //field
    private DataFileInformation dataFileInformation;
    private Scanner scanner;
    private Login login;
    private String user;
    private File file;

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
                "    2-) Sistemede o path bulunan dosya isimlerini göstersin\n" +
                "    3-) Dosya Bilgileri\n" +
                "    4-) Rol bilgimizi öğrenmek\n" +
                "    5-) Dosya izinleri(Rol değiştir sadece admin yapabilir.)\n" +
                "    6-) Dosya SİL\n" +
                "    7-) Dosya YAZMAK\n" +
                "    8-) Dosya OKUMAK\n" +
                "    9-) Sistemden ÇIKIŞ");
        return scanner.nextInt();
    }

    //is Login
    private boolean fileIsLogin() {
        boolean result = false;
        user = login.isLogin().toLowerCase();
        if (user != null && !user.equals("") && !user.isEmpty()) {
            System.out.println(user + " Sistemde birisi var");
            result = true;
        } else {
            System.out.println("Sistemde Böyle bir kullanıcı yoktur");
        }
        return result;
    }

    //redirectAdminPage
    private void redirectAdminPage() {
        if (fileIsLogin()){
            System.out.println("Admin Sayfasına Yönlendiriliyorsunuz\nDevam etmek için bi tuşa basınız...");
            scanner.nextLine();
            chooiseFile();
        } else
            login.isLogin();
    }

    //admin : username(admin)  ,password(passwd)
    //writer: username(writer) ,password(passwd)
    //user  : username(user)   ,password(passwd)
    //common Method
    private void chooiseFile() {
        while (true) {
            int chooise = chooiseUser();
            //ADMIN  ==> (W+,R+,D+,C+),
            //WRITER ==> (W+,R+,D-,C-),
            //USER   ==> (W-,R+,D-,C-)
            switch (chooise) {
                case 1:
                    if (user.equals("admin"))
                        fileCreate();
                    else
                        System.out.println("Yetkiniz Bulunmamaktadır. ");
                    break;

                case 2:
                    systemInFilesNames();
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
                    if (user.equals("admin"))
                        fileDelete();
                    else
                        System.out.println("Yetkiniz Bulunmamaktadır. ");
                    //(user.equals("admin") || user.equals("writer"))
                    break;

                case 7:
                    if (user.equals("admin") || user.equals("writer"))
                        datafileWriter();
                    else
                        System.out.println("Yetkiniz Bulunmamaktadır. ");
                    break;

                case 8:
                    datafileReader();
                    break;
                case 9:
                    //Admin tarafından verilen kodla kişi super-admin olsun(writer,user)
                    isRollesChange();
                    break;

                case 10:
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
        systemInFilesNames();
        System.out.println("Dosya adını yazınız");
        Scanner  scanner=new Scanner(System.in);
        String fileName=scanner.nextLine().concat(".txt");
        String path=FilePathNameStaticData.FILE_PATH.concat(fileName);
        file=new File(path);
        try {
            //createNewFile: zaten böyle bir dosya varsa ekleme yapmasın
            if (file.createNewFile()) {
                System.out.println(file + " oluşturuldu");
            } else {
                System.out.println(file + " zaten oluşturulmuş");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //Files Names
    private void systemInFilesNames() {
        System.out.println("##### Dosya isimleri ###");
        String staticPath=FilePathNameStaticData.FILE_PATH;
        //sonda bulunan root silmek =>
        String filePath=staticPath.substring(0,staticPath.length()-1);
        for(File temp: new File("C:\\io\\ecodation").listFiles()){
            System.out.println(temp.getName());
        }
    }

    //File Information
    private void fileInformation() {
        System.out.println("Dosya bilgileri");
        systemInFilesNames();
        System.out.println("Dosya adını yazınız.");
        Scanner scannerFile=new Scanner(System.in);
        String fileName=scannerFile.nextLine();
        file=new File(FilePathNameStaticData.FILE_PATH.concat("\\").concat(fileName).concat(".txt"));
        System.out.println("Toplam Karakter Sayısı: "+file.length());
    }

    //is My Permission
    private void isMyPermission() {
        System.out.println("Benim İznim");
    }

    //FILE PERMISSION
    private void filePermission() {
        System.out.println("Dosya...");
    }

    //FILE DELETE
    private void fileDelete() {
        systemInFilesNames();
        System.out.println("Dosya sil");
    }

    //WRITER
    private void datafileWriter() {
        System.out.println("Dosya yaz");
    }

    //READER
    private void datafileReader() {
        System.out.println("Dosya oku");
    }

    // is Rolles Change
    private void isRollesChange() {
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
