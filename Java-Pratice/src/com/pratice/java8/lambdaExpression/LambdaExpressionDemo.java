package com.pratice.java8.lambdaExpression;


@FunctionalInterface
interface Calculator{
    int add(int a,int b);
}
public class LambdaExpressionDemo {

    public static void main(String args[]){

        Calculator cal= (int a,int b) ->{return a+b;};
        System.out.println(cal.add(4,6));
    }
}
