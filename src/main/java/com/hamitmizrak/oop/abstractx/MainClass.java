package com.hamitmizrak.oop.abstractx;

public class MainClass {
    public static void main(String[] args) {

        Person person2=new Student(); //polymorphism
        person2.setUsername("person-student adı");
        person2.setPassword("person-student şifresi");
        person2.setEmail("person-student email");
        person2.setData("person-student Data");
        person2.govdeliMethod(44); //polymorphism
        System.out.println(person2);

        System.out.println("++++++++++++");
        Student student=new Student();
        student.setUsername("öğrenci adı");
        student.setPassword("öğrenci şifresi");
        student.setEmail("öğrenci email");
        student.setData("öğrenci Data");
        student.setSpecialProperties("Properties");
        student.govdeliMethod(12); //polymorphism
        System.out.println(student);

        System.out.println("++++++++++++");

        Teacher teacher=new Teacher();
        teacher.setUsername("Teacher adı");
        teacher.setPassword("Teacher şifresi");
        teacher.setEmail("Teacher email");
        teacher.setData("Teacher Data");
        teacher.govdeliMethod(55);
        System.out.println(teacher);
    }
}
