package com.hamitmizrak.javasetutorials;

import javax.swing.*;
import java.util.Scanner;

public enum _17_EnumFactoriyel {
    ITERATIVE,RECURSIVE
}

////////////////////////////////////////
class RecursiveIterativeMethod {

    //Scanner
    private static Scanner scanner = new Scanner(System.in);

    //userDate
    public static int userData() throws MySpecialException {
        int number= Integer.valueOf(JOptionPane.showInputDialog("Lütfen faktoriyel hesap için bir sayı giriniz"))  ;
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
        //InputMismatchException:  Character.isLetter,isDigit
        String iterative=_17_EnumFactoriyel.ITERATIVE.toString();
        String recursive=_17_EnumFactoriyel.RECURSIVE.toString();
        String allData="\nLütfen bir seçim yapınız."
                .concat("\n1-)")
                .concat(iterative)
                .concat("\n2-)")
                .concat(recursive)
                .concat("\n3-)Exit");
        System.out.println(allData);
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

