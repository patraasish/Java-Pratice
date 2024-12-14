package com.pratice.core.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();

        //add
        linkedHashMap.put(101,"Asish");
        linkedHashMap.putIfAbsent(102,"Patra");


        System.out.println("Initial: ");
        int size=linkedHashMap.size();
        System.out.println("Size: "+size);
        //read
        for (Map.Entry<Integer,String> entry:linkedHashMap.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        //update
        linkedHashMap.put(102,"Das");
        System.out.println("After update: "+linkedHashMap);

        //Delete
        linkedHashMap.remove(102);
        System.out.println("After Delete: "+linkedHashMap);


    }
}
