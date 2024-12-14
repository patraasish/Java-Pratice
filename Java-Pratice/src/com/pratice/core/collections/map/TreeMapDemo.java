package com.pratice.core.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap1=new TreeMap<>();
        TreeMap<String,Integer> treeMap2=new TreeMap<>();

        treeMap1.put(3,"Asish");
        treeMap1.put(1,"Asish");
        treeMap1.put(4,"Asish");
        treeMap1.put(2,"Asish");

        System.out.println("Initial: ");

        for (Map.Entry<Integer,String > entry:treeMap1.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        treeMap2.put("Zsish1",26);
        treeMap2.put("Msish2",21);
        treeMap2.put("Dsish3",23);
        treeMap2.put("Asish4",45);

        System.out.println("TreeMap2: " +treeMap2);


    }
}
