package com.hamitmizrak.javasetutorials;


import java.util.Random;
import java.util.Scanner;

// 1<=USER<=kullanıcının verdiği sayı arasında rastgele 5 tane sayı
// toplamını diziyle yapalım
// bu sayılardan kaç tane tek sayı vardır, ve tek sayılar toplamı nedir ?


public class _20_Array_Examples2 {

    //scanner
    private static Scanner scanner = new Scanner(System.in);

    // user name letter
    public static int matrixMyNameLetter() {
        System.out.println("Lütfen bir sayı giriniz");
        return scanner.nextInt();
    }

    // user name letter matrix added
    public static int[] randomNumberSum() {
        int number = matrixMyNameLetter();
        int[] array = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(number) + 1;
            array[i] = randomNumber;
        }
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        return array;
    }

    public static void commonProcessingArray() {
        int[] randomNumber = randomNumberSum();
        int commonSum = 0, oddCounter = 0, oddSum = 0;

        int[] oddArray = new int[0];
        for (int i = 0; i < randomNumber.length; i++) {
            commonSum += randomNumber[i];
            if (randomNumber[i] % 2 == 1) {
                oddCounter++;
                oddSum += randomNumber[i];
            }
            //tek sayılar
            //clone array
            oddArray = new int[oddSum];
            //loop
            oddArray[i] = randomNumber[i];
        }
        System.out.println("\nsayı toplamları: " + commonSum);
        for (int temp : oddArray) {
            System.out.print(temp + " ");
        }
        System.out.println("Tek sayılar sayısı: " + oddCounter);
        System.out.println("Tek sayı toplamları: " + oddSum);

    }

    //PSVM
    public static void main(String[] args) {

        commonProcessingArray();
    }
}
