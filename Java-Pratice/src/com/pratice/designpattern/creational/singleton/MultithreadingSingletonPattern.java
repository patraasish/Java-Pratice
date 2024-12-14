package com.pratice.designpattern.creational.singleton;

public class MultithreadingSingletonPattern {

    private static MultithreadingSingletonPattern multithreadingSingletonPattern=null;

    private String text="MultithreadingSingletonPattern";

    public String getText() {
        return text;
    }

    private MultithreadingSingletonPattern(){

    }

    public static MultithreadingSingletonPattern getInstance(){

        if(multithreadingSingletonPattern==null){
            //class level lock
            synchronized(MultithreadingSingletonPattern.class){
                if (multithreadingSingletonPattern==null){
                    multithreadingSingletonPattern=new MultithreadingSingletonPattern();
                }
            }
        }
        return  multithreadingSingletonPattern;
    }
}
