package com.hamitmizrak.fileio;

import java.util.Scanner;

public class Login {
    //field
    private String username;
    private String password;

    //parametresiz constructor
    public Login() {
    }

    //parametreli constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //toString
    @Override
    public String toString() {
        return "LoginDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    //metotlar
   /*
    admin : username(admin)  ,password(passwd)
    writer: username(writer) ,password(passwd)
    user  : username(user)   ,password(passwd)
    */
    public Login[] allPersonLoginData(){
        Login[] person=new Login[3];
        person[0]=new Login(ERoles.ADMIN.getValue(),"123");
        person[1]=new Login(ERoles.WRITER.getValue(),"123");
        person[2]=new Login(ERoles.USER.getValue(),"123");
        return person;
    }

    //username
    public String[] getUserInput(){
        Scanner klavye=new Scanner(System.in);
        String[] login=new String[2];
        String username,password;
        System.out.println("Lütfen kullanıcı adınızı giriniz");
        username=klavye.nextLine();
        System.out.println("Lütfen kullanıcı şifrenizi giriniz");
        password=klavye.nextLine();
        login[0]=username;
        login[1]=password;
        return login;
    }

    //system isLogin
    public String isLogin(){
        /*for ( String temp: getUserInput()) {
            System.out.println(temp);
        }*/
        String [] userDataInput=new String[2];
        userDataInput= getUserInput();
        Login[] user= allPersonLoginData();
        String rolles="";
        if( (userDataInput[0].equals(user[0].getUsername())) && (userDataInput[1].equals(user[0].getPassword()))){
            System.out.println("Admin");
            rolles="Admin";
        }else if( (userDataInput[0].equals(user[1].getUsername())) && (userDataInput[1].equals(user[1].getPassword())) ){
            System.out.println("Writer");
            rolles="Writer";
        }else if( (userDataInput[0].equals(user[2].getUsername())) && (userDataInput[1].equals(user[2].getPassword())) ){
            System.out.println("User");
            rolles="User";
        }else{
            System.out.println("Rol dışı");
        }
        return rolles;
    }

    //Getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //psvm
    public static void main(String[] args) {
        //instance
        Login login=new Login();
        login.isLogin();
    }
}
