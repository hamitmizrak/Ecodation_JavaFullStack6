package com.hamitmizrak.oop.abstractx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

abstract public class Person {
    private String username;
    private String password;
    private String email;
    private String data;

    public void govdeliMethod(int number){
        System.out.println("Gövdeli method "+number);
    }

   abstract public void govdesizMethod(int number);
}