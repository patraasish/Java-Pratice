package com.pratice.java8.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {

        List<String> list= Arrays.asList("asish","patra");
        list.forEach(MethodReferenceDemo::print);
        list.forEach(System.out::println);
    }
}
