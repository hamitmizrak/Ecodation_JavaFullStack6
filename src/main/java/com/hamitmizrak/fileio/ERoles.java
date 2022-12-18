package com.hamitmizrak.fileio;

public enum ERoles {
    ADMIN(1,"admin"),WRITER(2,"writer"),USER(3,"user");

    /*
    final
    1-) interface verirsek ==> bütün implementleri gelmemesini sağlar:
     Examples: public final interface deneme
    2-) değişkenlerde verirsek ==> sabit yapar.
    3-) metotlarda verirsek ==> Override yapamayız
    4-) classlarda verirse ==> extends yapamayız
     */

    /*
    değişkene final verirsek;
    1-) bizi parametreli constructora zorlar
    2-) setter metotu yazmamızı engeller
     */
    private final int key;
    private final String value;

    // constructor private verdim amaçım
    // bu classın instance(new) oluşturmasını engellemek
   private ERoles(int key, String value) {
        this.key = key;
        this.value = value;
    }

    //GETTER
    public int getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
