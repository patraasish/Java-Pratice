package com.pratice.core.recursion;

public class FibonaciiDemo {

    static int fibMethod(int num){

        if(num<2){
            return num;
        }
        return fibMethod(num-1)+fibMethod(num-2);
    }

    public static void main(String[] args) {

        int result=fibMethod(11);
        System.out.println(result);
    }
}
