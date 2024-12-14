package com.pratice.designpattern.creational.factory;

public class ShapeFactory {

    public Shape getInstance(String instanceName){

        switch (instanceName){
            case "circle":
                return new Circle();
            case "rectangular":
                return new Rectangular();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
