package com.hamitmizrak.javasetutorials;


import java.util.Scanner;

// 1-9 arasında rastgele 5 tane sayı toplamını diziyle yapalım
// bu sayılardan kaç tane tek sayı vardır, ve tek sayılar toplamı nedir ?

// ödev:
/*
4 X 4 matrix olsun
isminizin ilk harfi diagonal altında olacak şekilde
isminizin son harfi diagonal üstünde olacak şekilde
ismimizin orta harfi diagonal olacak şekilde  TEKSE: (n+1)/2
*/
public class _19_Array_Examples {

    //scanner
    private static Scanner scanner = new Scanner(System.in);

    public static char[] matrixMyNameLetter() {
        System.out.println("Lütfen isminizi giriniz");
        String username = scanner.nextLine();
        char firstLetter = username.charAt(0);
        char middleLetter = username.charAt(username.length() / 2);
        char lastLetter = username.charAt(username.length() - 1);
        System.out.println(firstLetter + " " + middleLetter + " " + lastLetter);
        char[] arr = {firstLetter, middleLetter, lastLetter};
        return arr;
    }

    public static void showScreenArray() {
        char[] arr = matrixMyNameLetter();
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {//satır
            for (int j = 0; j < matrix[i].length; j++) {//sutun
                /*if (i > j) {

                } else if (i < j) {

                } else {

                }*/
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrixMyNameLetter();
    }
}
