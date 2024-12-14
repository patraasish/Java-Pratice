package com.pratice.dsa.sorting;

public class InsertionSortDemo {

    public static int[] insertionSort(int arr[]){

        int size= arr.length;

        for (int i = 1; i <size ; i++) {

            int key=arr[i];
            int j=i-1;

            while (j>=0 && arr[i]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[]={3,2,1,5,33};

        int result[]=insertionSort(arr);

        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
