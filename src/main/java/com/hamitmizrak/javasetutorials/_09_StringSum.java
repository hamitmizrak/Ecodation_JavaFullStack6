package com.hamitmizrak.javasetutorials;

public class _09_StringSum {

    public static void main(String[] args) {
        //Kullanıcıdan alacağımız 3 tane veriyi birleştirelim ?
        //Harf sayısı karakter sayısı(length())
        //Başında ve sonunda trimlendimş harf sayısı(trim)
        //J ile başlıyor mu ?(starsWtith())
        //J ile bitiyor mu ? (endsWith())
        //Hepsini BÜYÜK harf yapalım ? (toUppercase())
        //Hepsini küçük harf yapalım ? (toLowerCase())
        //elde ettiğimiz veriye sonuna java ekliyelim )(concat)
        //bu veri boş mu dolumu ?
        //bu veriyle "merhabalar ben java öğreniyorum" kelimesiyle değiştirelim.


        //Birleştirme
        String str1="javase";
        String str2="javame";
        String str3="javaee";

        //1.YOL
        String str4=str1+str2+str3;
        System.out.println(str4+"\n");

        //2.YOL
        String str5=str1.concat(str2).concat(str3);
        System.out.println(str5+"\n");

        //3.YOL
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(str1).append(str2).append(str3);
        String bufferToString=stringBuffer.toString();
        System.out.println(bufferToString+"\n");

        //4.YOL
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(str1).append(str2).append(str3);
        String stringBuilderToString=stringBuffer.toString();
        System.out.println(stringBuilderToString+"\n");
    }
}
