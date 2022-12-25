package com.hamitmizrak.fileio;

public class Description {
    /*
    Dikkat edilecek hususlar:
    1-) Clean Code mantığında yazmak
    2-) kendimi tekrar etmemek (Methodlar)
    3-) Class mantığını göre oluşturmak ve OOP göre yazmak
    4-) try-catch, Enum, class,exceptionHandling ,String, Method,static etc. kullanalım

    Step-1) Login Ekranı
    Enum Rolles
    Aşağıdaki bilgiler tek boyutlu dizide saklayalım
    admin : username(admin)  ,password(passwd)
    writer: username(writer) ,password(passwd)
    user  : username(user)   ,password(passwd)
    - Sisteme login olurken kullanıcıdan username ve password istensin
    - 3 hakkımız var. 3 haktan sonra sistemi kapatsın(System.exit(0))

    Step-2) C:\\io\\ecodation\\data.txt" adında bir dosya ve dizinleri default oluşturak oluşturalım. (constructor)

    C=create (oluşturmak)
    D=delete (silmek)
    W=write  (yazmak)
    R=read   (okumak)
    Step-3) Rolles belirliyoruz.
        ADMIN  ==> (W+,R+,D+,C+),
        WRITER ==> (W+,R+,D-,C-),
        USER   ==> (W-,R+,D-,C-) (Enum)

    Step-4)  Console ekranında seçim (switch-case)
    NOT: chooise methodları interface yapalım.
    ######## SEÇİM YAPINIZ ###########
    1-) Dosya OLUŞTUR
    2-) Sistemede o path bulunan dosya isimlerini göstersin
    3-) Dosya Bilgileri
    4-) Rol bilgimizi öğrenmek
    5-) Dosya izinleri(Rol değiştir sadece admin yapabilir.)
    6-) Dosya SİL
    7-) Dosya YAZMAK
    8-) Dosya OKUMAK
    9-) Dosya ADINI DEĞİŞTİR
    10-) super code olan writer veya user rolü  ==>
    super-admin olsun kullanıcı eğer: "XKLM4512WE@" bu şifreyi biliyorsa artık bu admin olsun
    ancak adminse tekrardan admin olmasına gerek yoktur.
    11-) Sistemden ÇIKIŞ (System.exit(0))
    */
}
