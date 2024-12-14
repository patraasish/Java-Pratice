package com.pratice.java8.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {


        Predicate<String> isStartWithA = (x) -> x.toLowerCase().startsWith("a");
        Predicate<String> isEndWithH = (x) -> x.toLowerCase().endsWith("h");
        Predicate<String> and=isStartWithA.and(isEndWithH);
        Predicate<String> or=isStartWithA.or(isEndWithH);
        Predicate<String> negate=isStartWithA.negate();

        System.out.println(isStartWithA.test("Asish"));
        System.out.println(and.test("Biswa"));
        System.out.println(or.test("Harsh"));
        System.out.println(negate.test("Asid"));

    }

}
