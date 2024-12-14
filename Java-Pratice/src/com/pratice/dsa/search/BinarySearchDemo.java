package com.pratice.dsa.search;

public class BinarySearchDemo {

    public static int binarySearch(int arr[],int target){

        int left=0;
        int right=arr.length-1;

        while(left<=right){

            int midIndex=(left+right)/2;
            if(arr[midIndex]==target){
                return midIndex;
            }
            else if (arr[midIndex]<target) {
                left=midIndex+1;
            }

            else{
                right=midIndex-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[]={4,2,1,5,62};

        int result=binarySearch(arr,62);
        System.out.println("Element present at index : "+result);
    }
}
