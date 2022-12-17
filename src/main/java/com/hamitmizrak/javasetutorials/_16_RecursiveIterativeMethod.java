package com.hamitmizrak.javasetutorials;

import java.util.Scanner;

public class _16_RecursiveIterativeMethod {

    //Scanner
    private static Scanner scanner = new Scanner(System.in);

    //userDate
    public static int userData() throws MySpecialException {
        System.out.println("Lütfen faktoriyel hesap için bir sayı giriniz");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Sıfırdan küçük sayı giremezsiniz");
            number = Math.abs(number);
        } else if (number == 0 || number == 1)
            return 1;
        else if (number > 20) {
            System.out.println("Lütfen 20 büyük sayı girmeyiniz");
            throw new MySpecialException("Lütfen 20 büyük sayı girmeyiniz");
        }
        return number;
    }

    //chooise
    public static void chooise() throws MySpecialException {
        System.out.println("\nLütfen bir seçim yapınız.\n1-)İterative Factoriyel\n2-)Recursive Factoriyel\n3-)Exit");
        int user = scanner.nextInt();
        switch (user) {
            case 1:
                int numberFactoriyel = userData();
                iterativeFactoriyel(numberFactoriyel);
                break;

            case 2:
                int numberRecursive = userData();
                int result = recursiveFactoriyel(numberRecursive);
                System.out.println(numberRecursive + " sayısınının factoriyeli: " + result);
                break;

            case 3:
                System.out.println("Çıkış yapılıyor");
                System.exit(0);
                break;

            default:
                System.out.println("sadece belirtilen sayıları girelim");
                break;
        }
    }

    //iterative
    public static void iterativeFactoriyel(int number) throws MySpecialException {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result = result * i;
        }
        System.out.println(number + " sayısınının factoriyeli: " + result);
    }

    //recursive
    public static int recursiveFactoriyel(int number) throws MySpecialException {
        if (number <= 0 || number == 1)
            return 1;
        return number * recursiveFactoriyel(number - 1);
    }

    //PSVM
    public static void main(String[] args) throws MySpecialException {
        while (true) {
            chooise();
        }
    }
}
