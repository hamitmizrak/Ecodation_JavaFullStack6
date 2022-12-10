package com.hamitmizrak.javasetutorials;

import javax.swing.*;
import java.util.Scanner;

public class _04_Scanner {
    public static void main(String[] args) {

        // 1.YOL
        /*
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen birşey yazınız");
        String vocabularyData=klavye.nextLine();
        */

        // 2.YOL
        String vocabularyData=  JOptionPane.showInputDialog("Lütfen birşeyler giriniz");

        System.out.println("karakter sayısı: " + vocabularyData.length());
        System.out.println("karakter sayısı: " + vocabularyData.trim().length());
        System.out.println("ile başlamak: " + vocabularyData.startsWith("J"));
        System.out.println("ile bitmek: "+vocabularyData.endsWith("m") );
        System.out.println("Büyük: "+vocabularyData.toUpperCase() );
        System.out.println("Küçük: "+vocabularyData.toLowerCase() );

        System.out.println("Sona eklemek: "+vocabularyData.concat(" sona44") );

        System.out.println(vocabularyData.indexOf("JAva"));
        System.out.println(vocabularyData.lastIndexOf("JAva"));

        System.out.println(vocabularyData.replace(vocabularyData,"değişti"));
        System.out.println("var mı? "+vocabularyData.contains("öğreniyorum"));
        System.out.println("boş mı? "+vocabularyData.isEmpty());
        System.out.println(vocabularyData.equals("farklı alan"));
    }
}
