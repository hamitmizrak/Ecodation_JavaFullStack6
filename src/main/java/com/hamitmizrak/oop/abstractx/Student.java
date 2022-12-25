package com.hamitmizrak.oop.abstractx;

import lombok.Data;

@Data
public class Student extends Person {

    private String specialProperties;

    public Student(){}

    public Student(String username, String password, String email, String data, String specialProperties) {
        super(username, password, email, data);
        this.specialProperties = specialProperties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "specialProperties='" + specialProperties + '\'' +
                "} " + super.toString();
    }

    @Override
    public void govdesizMethod(int number) {
        System.out.println("Öğrenci: "+number);
    }
}
