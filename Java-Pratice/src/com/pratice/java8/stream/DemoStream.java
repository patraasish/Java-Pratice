package com.pratice.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,54,54,23,13,65,32);
        List<Integer> result= integerList.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
