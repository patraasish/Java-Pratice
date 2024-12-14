package com.pratice.questions;

public class FindIndexOfTwoEleSUM {

    static void findIndexOfSUMElements(int arr[],int target){

        int count=0;
        int [] result=new int[5];


        for (int i = 0; i < arr.length; i++) {

            for (int j=0;j< arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+","+j);
                    return;
                    }

            }
        }

       // return result;
    }

    public static void main(String[] args) {
        int arr[]={3,2,92,4,};
        findIndexOfSUMElements(arr,5);

    }

}
