package com.hamitmizrak.javasetutorials;


import nonapi.io.github.classgraph.json.JSONUtils;

public class _23_Generics<T>{

    private T username;

    public _23_Generics() {
    }

    public _23_Generics(T username) {
        this.username = username;
    }

    public T getUsername() {
        return username;
    }

    public void setUsername(T username) {
        this.username = username;
    }
}

class MainClass{
    public static void main(String[] args) {
        _23_Generics generics=new _23_Generics();
        generics.setUsername("4asdasd4");
        System.out.println(generics.getUsername());
    }
}
