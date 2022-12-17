package com.hamitmizrak.javasetutorials;

import java.util.Arrays;
import java.util.Scanner;

public class _18_Array {
    public static void main(String[] args) {

        // Tek boyuklu diziler
        // dizilerin elaman sayısını söylememiz gerekiyor.
        // sıfırıncı indiste başlar
        int[] diziAdi = new int[6];
        //Object[] diziAdi = new Object[6];
        diziAdi[0] = 60;
        diziAdi[1] = 50;
        diziAdi[2] = 10;
        diziAdi[3] = 20;
        diziAdi[4] = 40;
        diziAdi[5] = 30;
        // System.out.println(diziAdi[3]);
        //iterative loop
        for (int i = 0; i < 5; i++) {
            System.out.print(diziAdi[i] + " ");
        }

        System.out.println("");
        for (int i = 0; i < diziAdi.length; i++) {
            System.out.print(diziAdi[i] + " ");
        }
        System.out.println("");
        Arrays.sort(diziAdi);

        int[] diziAdi2 = diziAdi.clone();
        boolean result = Arrays.equals(diziAdi, diziAdi2);
        System.out.println(result);
        //2.YOL
        for (int temp : diziAdi) {
            System.out.print(temp + " ");
        }
        System.out.print( "\n");

        //Multiple Array
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        for (int i = 0; i < matrix.length; i++) {//satır
            for (int j = 0; j < matrix[i].length; j++) {//sutun
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // ödev:
        /*
        4 X 4 matrix olsun
        isminizin ilk harfi diagonal altında olacak şekilde
        isminizin son harfi diagonal üstünde olacak şekilde
        ismimizin orta harfi diagonal olacak şekilde
        */


    }
}
