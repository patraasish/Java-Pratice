package com.pratice.designpattern.creational.singleton;

public class TestSingletonPattern {

    public static void main(String args[]){
       // LazySingletonPattern singletonPattern =LazySingletonPattern.getInstance();
       // System.out.println(singletonPattern.getText());

//        EagerSingletonPattern eagerSingletonPattern=EagerSingletonPattern.getInstance();
//        System.out.println(eagerSingletonPattern.getText());

        MultithreadingSingletonPattern multithreadingSingletonPattern=MultithreadingSingletonPattern.getInstance();
        System.out.println(multithreadingSingletonPattern.getText());
    }
}
