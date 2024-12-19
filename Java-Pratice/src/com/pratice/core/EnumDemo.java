package com.pratice.core;


enum Color{
    RED,
    GREEN,
    BLUE;
}


public class EnumDemo {

    public static void main(String[] args) {

        for (Color color:Color.values()){
            System.out.println(color);
        }


    }
}
