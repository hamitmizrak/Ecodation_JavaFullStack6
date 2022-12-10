package com.hamitmizrak.javasetutorials;

public class _02_Examples {
    public static void main(String[] args) {
        // 1.soru
        // 1.dereceden 2 bilinmeyenli denklem
        // y=3x+4k;
        // x=5;
        // k=3
        int x = 5;
        int k = 3;
        int result1 = 3 * x + 4 * k;
        System.out.println("Bilinmeyen: " + result1);
        System.out.println("");

        // 2.soru
        // Dereceyi Fahrenhayt
        // (derece*9/5)+32
        // 0 derece 32 fahrenhayttır
        double degree = 0, fahrenhayt = 0;
        fahrenhayt= degree * 9 / 5 + 32;
        System.out.println("Fahrenhayt: "+fahrenhayt+"\n");

        // 3.soru iki sayıda dört işlem
        // x1=4,x2=2;
        int number1,number2;
        number1=40;
        number2=10;
        System.out.println("Toplam: "+(number1+number2));
        System.out.println("Çıkarma: "+(number1-number2));
        System.out.println("Çarpma: "+(number1*number2));
        System.out.println("Bölüm: "+(number1/number2));
        System.out.println("Kalan: "+(number1%number2));
        // bölme/çıkarma/çarpma/toplama/bölümünden kalan(%)

        // 4.soru VKI
        // boy=181 CM
        // kilo: 92 KG
        // Erkek: VKI=kilo/boy*boy
        double weight = 92, height = 181,vki;
        vki=weight/height*height;
        System.out.println("VKI: "+vki+"\n");
    }
}
