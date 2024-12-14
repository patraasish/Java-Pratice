package com.pratice.dsa.search;

public class LinearSearchDemo {

    public static int linearSearch(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={4,2,1,5,62};
        int target=9;
        int result=linearSearch(arr,target);

        if(result<0){
            System.out.println("Sorry! Element not found");
        }
        else {
            System.out.println("Element present in index number: " + result);
        }
        }
}
