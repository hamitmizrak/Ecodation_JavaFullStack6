package com.hamitmizrak.javasetutorials;

import java.util.*;

public class _25_CollectionMapData {
    public static void main(String[] args) {
        //HLT:
        Map<Integer,String> list = new TreeMap<>();
        list.put(0 ,"Malatya");
        list.put(1 ,"Elazığ");
        list.put(2 ,"Bingöl");
        list.put(3 ,"Muş");
        list.put(5 ,"Van");
        list.put(4 ,"Diyarbakır");
        list.put(6 ,"Diyarbakır");

        //System.out.println(list.size());
        //
        for (Integer key: list.keySet()) {
            System.out.println(key+" ");
        }

        System.out.println("\n");
        for (String value: list.values()) {
            System.out.println(value+" ");
        }

        System.out.println("\n");
        for (Integer key: list.keySet()) {
            System.out.println(key+"=>"+list.get(key)+" ");
        }
    }
}
