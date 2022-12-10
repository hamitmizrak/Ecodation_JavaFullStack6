package com.hamitmizrak.javasetutorials;

public class _03_String {
    public static void main(String[] args) {
        String vocabulary = "JAva öğreniyorum JAva";
        System.out.println("karakter sayısı: " + vocabulary.length());
        System.out.println("karakter sayısı: " + vocabulary.trim().length());
        System.out.println("ile başlamak: " + vocabulary.startsWith("J"));
        System.out.println("ile bitmek: "+vocabulary.endsWith("m") );
        System.out.println("Büyük: "+vocabulary.toUpperCase() );
        System.out.println("Küçük: "+vocabulary.toLowerCase() );

        System.out.println("Sona eklemek: "+vocabulary.concat(" sona44") );

        System.out.println(vocabulary.indexOf("JAva"));
        System.out.println(vocabulary.lastIndexOf("JAva"));

        System.out.println(vocabulary.replace(vocabulary,"değişti"));
        System.out.println("var mı? "+vocabulary.contains("öğreniyorum"));
        System.out.println("boş mı? "+vocabulary.isEmpty());
        System.out.println(vocabulary.equals("farklı alan"));

        System.out.println(vocabulary.substring(1));
        System.out.println(vocabulary.substring(1,4)); //1<=X<=4-1
    }
}
