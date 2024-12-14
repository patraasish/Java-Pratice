package com.pratice.designpattern.creational.singleton;

public class EagerSingletonPattern {

    /*In EagerSingletonPattern also there is a problem
    It's auto created when class is loaded
    what if there is no usage of this class,
    there unnecessary an object created
     */
    private static final EagerSingletonPattern eagerSingletonPattern=new EagerSingletonPattern();
    private String text="EagerSingletonPattern";

    public String getText() {
        return text;
    }

    private EagerSingletonPattern(){

    }

    public static EagerSingletonPattern getInstance() {
        return eagerSingletonPattern;
    }


}
