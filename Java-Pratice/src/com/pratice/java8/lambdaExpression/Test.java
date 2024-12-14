package com.pratice.java8.lambdaExpression;

public class Test {
    public static void main(String[] args) {

        int arr[]={2,1,5,4,3,9};
        int length=arr.length;
        int temp;

        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <length ; j++) {

                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                if (arr[i]==arr[j]){
                    break;
                }
            }
    }

        for (int i = 0; i < length ; i++) {
            System.out.print(arr[i]);
        }
}}
