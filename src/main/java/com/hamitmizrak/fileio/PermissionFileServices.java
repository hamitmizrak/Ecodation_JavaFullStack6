package com.hamitmizrak.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class PermissionFileServices {

    //field
    private DataFileInformation dataFileInformation;
    private Scanner scanner;
    private Login login;
    private String rolles;
    private File file;

    //parametresiz constructor
    public PermissionFileServices() {
        dataFileInformation = new DataFileInformation();
        scanner = new Scanner(System.in);
        login = new Login();
    }

    //common Method
    private int chooiseUser() {
        System.out.println("    " +
                "    1-) Dosya Oluştur\n" +
                "    2-) Sistemede o path bulunan dosya isimlerini göstersin\n" +
                "    3-) Dosya Bilgileri\n" +
                "    4-) Rol bilgimizi öğrenmek\n" +
                "    5-) Dosya izinleri(Rol değiştir sadece admin yapabilir.)\n" +
                "    6-) Dosya Sil\n" +
                "    7-) Dosya Yaz\n" +
                "    8-) Dosya Oku\n" +
                "    9-) Dosya Adını Değiştir\n" +
                "    10-) super code olan writer veya user rolü  ==>  super-admin olsun\n" +
                "    11-) Sistemden ÇIKIŞ (System.exit(0))");
        return scanner.nextInt();
    }

    //is Login
    private boolean fileIsLogin() {
        boolean result = false;
        rolles = login.isLogin().toLowerCase();
        if (rolles != null && !rolles.equals("") && !rolles.isEmpty()) {
            System.out.println("rolünüz: " + rolles);
            result = true;
        } else {
            System.out.println("Sistemde Böyle bir kullanıcı yoktur");
        }
        return result;
    }

    //redirectAdminPage
    private void redirectAdminPage() {
        if (fileIsLogin()) {
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
                    if (rolles.equals("admin"))
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
                    changeRolles();
                    break;

                case 6:
                    if (rolles.equals("admin"))
                        fileDelete();
                    else
                        System.out.println("Yetkiniz Bulunmamaktadır. ");
                    //(rolles.equals("admin") || rolles.equals("writer"))
                    break;

                case 7:
                    if (rolles.equals("admin") || rolles.equals("writer"))
                        datafileWriter();
                    else
                        System.out.println("Yetkiniz Bulunmamaktadır. ");
                    break;

                case 8:
                    datafileReader();
                    break;


                case 9:
                    //Admin tarafından verilen kodla kişi super-admin olsun(writer,user)
                    isFileRename();
                    break;

                case 10:
                    //Admin tarafından verilen kodla kişi super-admin olsun(writer,user)
                    isRollesChange();
                    break;

                case 11:
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
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine().concat(".txt");
        String path = FilePathNameStaticData.FILE_PATH.concat(fileName);
        file = new File(path);
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
        String staticPath = FilePathNameStaticData.FILE_PATH;
        //sonda bulunan root silmek =>
        String filePath = staticPath.substring(0, staticPath.length() - 1);
        for (File temp : new File("C:\\io\\ecodation").listFiles()) {
            System.out.println(temp.getName());
        }
    }

    //File Information
    private void fileInformation() {
        System.out.println("\n#### Dosya bilgileri ####");
        systemInFilesNames();
        System.out.println("\nDosya adını yazınız.");
        Scanner scannerFile = new Scanner(System.in);
        String fileName = scannerFile.nextLine();
        file = new File(FilePathNameStaticData.FILE_PATH.concat("\\").concat(fileName).concat(".txt"));
        System.out.println("Toplam Karakter Sayısı: " + file.length());
        System.out.println("Dosya yazma izni: " + file.canWrite());
        System.out.println("Dosya okuma izni: " + file.canWrite());
        System.out.println("Dosya çalıştırma izni: " + file.canExecute());
        System.out.println("Hashcode: " + file.hashCode());
        System.out.println("Toplam GB: " + file.getTotalSpace());
        System.out.println("Kullanabileceğim GB: " + file.getFreeSpace());
        System.out.println("Kullandığım GB: " + file.getUsableSpace());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Değiştirme Tarihi: " + new Date(file.lastModified()));
    }

    //is My Permission
    private void isMyPermission() {
        System.out.println("Rolüm: " + rolles);
    }

    //FILE PERMISSION
    private void changeRolles() {
        System.out.println("Rol değiştir...");
    }

    //FILE DELETE
    private void fileDelete() {
        System.out.println("\n### Dosya sil ###");
        systemInFilesNames();
        System.out.println("Silmek istediğiniz Dosya adını yazınız");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine().concat(".txt");
        String path = FilePathNameStaticData.FILE_PATH.concat(fileName);
        file = new File(path);
        try {
            if (file.exists()) {
                file.delete();
                System.out.println(fileName + " Dosyanız silindi");
            } else {
                System.out.println(fileName + " Dosyanız silindi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //WRITER
    private void datafileWriter() {
        System.out.println("Dosya yaz");
    }

    //READER
    private void datafileReader() {
        System.out.println("Dosya oku");
    }


    private void isFileRename() {
        //System.out.println("Dosya ismini değiştirmek: "+file.renameTo();
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
