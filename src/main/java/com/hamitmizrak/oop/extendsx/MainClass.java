package com.hamitmizrak.oop.extendsx;

public class MainClass {
    public static void main(String[] args) {

        Person person=new Person();
        person.setUsername("person adı");
        person.setPassword("person şifresi");
        person.setEmail("person email");
        person.setData("person Data");
        System.out.println(person);

        System.out.println("++++++++++++");
        Student student=new Student();
        student.setUsername("öğrenci adı");
        student.setPassword("öğrenci şifresi");
        student.setEmail("öğrenci email");
        student.setData("öğrenci Data");
        student.setSpecialProperties("Properties");
        System.out.println(student);

        System.out.println("++++++++++++");

        Teacher teacher=new Teacher();
        teacher.setUsername("Teacher adı");
        teacher.setPassword("Teacher şifresi");
        teacher.setEmail("Teacher email");
        teacher.setData("Teacher Data");
        System.out.println(teacher);
    }
}
