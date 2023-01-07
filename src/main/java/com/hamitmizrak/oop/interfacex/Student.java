package com.hamitmizrak.oop.interfacex;

import java.io.Serializable;

public class Student extends Person implements IDatabaseCrud, Serializable {

    //w3school
    //Udemy JavaSE
    //file

    @Override
    public void govdesizMethod(int number) {
        System.out.println("govdesizMethod: "+number);
    }

    @Override
    public void govdeliMethod(int number) {
        super.govdeliMethod(number);
    }

    @Override
    public void create() {
        System.out.println("create: ");
    }

    @Override
    public void delete(String param) {
        System.out.println("delete: "+param);
    }
}
