package com.pratice.core.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap();

        //add
        hashMap.put(101,"Asish");
        hashMap.putIfAbsent(102,"Patra");
        hashMap.putIfAbsent(102,"Chinu");

        System.out.println("Initial: ");
        //Read
        for (Map.Entry<Integer,String> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        //update
        hashMap.put(102,"Patra2");
        System.out.println("After Modify: "+ hashMap);

        //delete
        hashMap.remove(102);
        System.out.println("After Delete: "+hashMap);

        if(hashMap.containsKey(102)){

            hashMap.remove(102);
            System.out.println("With Condition: "+hashMap);
        }
    }
}
