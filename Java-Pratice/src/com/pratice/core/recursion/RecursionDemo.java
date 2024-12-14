package com.pratice.core.recursion;


public class RecursionDemo {


    static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }

    public static void main(String[] args) {
        int res = sum(10);
        System.out.println(res);

    }
}
