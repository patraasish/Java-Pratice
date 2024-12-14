package com.pratice.designpattern.creational.builder;

public class TestBuilder {

    public static void main(String[] args) {

        Burger burger=new Burger.BurgerBuilder()
                .egg(true)
                .onion(true)
                .size("Large")
                .build();

        System.out.println(burger);
    }
}
