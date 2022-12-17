package com.hamitmizrak.javasetutorials;


import java.util.Scanner;

// 1-9 arasında rastgele 5 tane sayı toplamını diziyle yapalım
// bu sayılardan kaç tane tek sayı vardır, ve tek sayılar toplamı nedir ?


// ödev:
/*
3 X 3 matrix olsun
isminizin ilk harfi diagonal üstünde olacak şekilde (i<j)
isminizin son harfi diagonal altında olacak şekilde (i>j)
ismimizin orta harfi diagonal olacak şekilde  TEKSE: (n+1)/2 (i==j)
*/
public class _19_Array_Examples {

    //scanner
    private static Scanner scanner = new Scanner(System.in);

    // user name letter
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

    // user name letter matrix added
    public static char[][] matrixDataAdded() {
        //tek boyutlu dizi
        char[] arr = matrixMyNameLetter();

        //çift boyutlu dizi
        char[][] matrix = new char[3][3];
        for (int i = 0; i < matrix.length; i++) {//satır
            for (int j = 0; j < matrix[i].length; j++) {//sutun
                if (i > j) {
                    matrix[i][j] = arr[2];
                } else if (i < j) {
                    matrix[i][j] =arr[0];
                } else {
                    matrix[i][j] =arr[1];;
                }
            } //end columns
            System.out.println();
        }//end rows
        return matrix;
    }

    // user name letter matrix showing
    public static void showingMatrixData(){
        char[][] matrix = new char[3][3];
        matrix=matrixDataAdded();
        //showing
        for (int i = 0; i < matrix.length; i++) {//satır
            for (int j = 0; j < matrix[i].length; j++) {//sutun
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //PSVM
    public static void main(String[] args) {
        //Monad
        showingMatrixData();
    }
}
