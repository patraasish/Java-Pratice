package com.pratice.designpattern.creational.factory;

public class FactoryDesignPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory= new ShapeFactory();
        Shape circle=shapeFactory.getInstance("circle");
        circle.draw();
        Shape rect=shapeFactory.getInstance("rectangular");
        rect.draw();
        Shape square=shapeFactory.getInstance("square");
        square.draw();
    }



}
