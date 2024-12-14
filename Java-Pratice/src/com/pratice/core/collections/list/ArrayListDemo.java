package com.pratice.core.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {



    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<Integer>();

        System.out.println("Initial size: "+integerList.size());
        //create elements
        integerList.add(32);
        integerList.add(54);
        integerList.add(31);

        //read elements
        System.out.print("Elements after adding: ");
        Iterator iterator=integerList.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        //update elements
        System.out.print("\nElements after updating: ");
        integerList.add(2,89);
        integerList.forEach(x->System.out.print(x+" "));

        //Delete elements
        System.out.print("\nElements after delete: ");
        integerList.remove(2);
        integerList.remove(0);

        for (Integer i:integerList){
            System.out.print(i+" ");
        }




    }
}
