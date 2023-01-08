package com.hamitmizrak.fileio;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

//lombok
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class Login {
    //field
    private String username;
    private String password;
    private static String rolles = null;


    //static: durağan:
    //Kullancınının yapacağı 3 kere yanlış şifre
    private static int COUNTER = 2;

    //metotlar
   /*
    admin : username(admin)  ,password(123)
    writer: username(writer) ,password(123)
    user  : username(user)   ,password(123)
    */
    public Login[] allPersonLoginData() {
        Login[] person = new Login[3];
        person[0] = new Login(ERoles.ADMIN.getValue(), "123");
        person[1] = new Login(ERoles.WRITER.getValue(), "123");
        person[2] = new Login(ERoles.USER.getValue(), "123");
        return person;
    }

    //username
    public String[] getUserInput() {
        Scanner klavye = new Scanner(System.in);
        String[] login = new String[2];
        String username, password;
        System.out.println("\nLütfen kullanıcı adınızı giriniz");
        username = klavye.nextLine();
        System.out.println("Lütfen kullanıcı şifrenizi giriniz");
        password = klavye.nextLine();
        login[0] = username;
        login[1] = password;
        return login;
    }

    //system isLogin
    public String isLogin() {
        /*for ( String temp: getUserInput()) {
            System.out.println(temp);
        }*/
        String[] userDataInput = getUserInput();
        Login[] user = allPersonLoginData();

        if (COUNTER >= 0) {
            if ((userDataInput[0].equals(user[0].getUsername())) && (userDataInput[1].equals(user[0].getPassword()))) {
                System.out.println("Admin");
                rolles = "Admin";
            } else if ((userDataInput[0].equals(user[1].getUsername())) && (userDataInput[1].equals(user[1].getPassword()))) {
                System.out.println("Writer");
                rolles = "Writer";
            } else if ((userDataInput[0].equals(user[2].getUsername())) && (userDataInput[1].equals(user[2].getPassword()))) {
                System.out.println("User");
                rolles = "User";
            } else {
                System.out.println("Kullanıcı username veya password yanlış girildi");
                if (COUNTER == 0) {
                    System.err.println("Hakkınız kalmadı Hesabımız bloke oldu");
                    throw new HamitMizrakException("Dikkat: Hakkınız kalmadı ");
                    //System.exit(0);
                }
                COUNTER--;
                System.out.println("kalan hakkınız: " + (COUNTER + 1));
                isLogin();
            }
        }
        return rolles;
    }

    //psvm
/*    public static void main(String[] args) {
        //instance
        Login login = new Login();
        login.isLogin();
    }*/
}
