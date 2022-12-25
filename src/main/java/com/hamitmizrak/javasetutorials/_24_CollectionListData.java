package com.hamitmizrak.javasetutorials;

import java.util.ArrayList;
import java.util.List;

public class _24_CollectionListData {
    public static void main(String[] args) {
        //LIST: L:arayayerleştirme,silme A:ekleme,arama V
        List<String> list = new ArrayList<>();
        list.add("Malatya");
        list.add("Elazığ");
        list.add("Bingöl");
        list.add("Muş");
        list.add("Van");
        list.add("Diyarbakır");
        list.add("Diyarbakır");

        //System.out.println(list.size());
        //System.out.println(list.get(0));
        //System.out.println(list.isEmpty());

        //Stream Method referances
        /*list.forEach(System.out::println);*/
        /*for ( String temp:list ) {
            System.out.println(temp);
        }*/
        /*System.out.println(list.remove(0));
        System.out.println("/////////////////");
        list.forEach(System.out::println);

        System.out.println(list.hashCode());
        System.out.println(list.contains("BingöL"));*/

        //lambda expression
        list.stream().forEach((temp)->{
            System.out.println(temp.toUpperCase());
        });


    }
}
