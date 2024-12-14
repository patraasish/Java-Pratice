package com.pratice.dsa.sorting;

public class SelectionSortDemo {


    public static int[] selectionSort(int arr[]){

        int temp=0;
        int minIndex=-1;
        int size=arr.length;

        for (int i = 0; i < size-1; i++) {

            minIndex=i;
            for (int j = i+1; j < size; j++) {

                if(arr[minIndex]>arr[i]){
                    minIndex=i;
                }

            }

            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

            for (int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[]={4,3,1,5,9,2};

        System.out.print("Before sorting: ");
        for (int num:arr){
            System.out.print(num+" ");
        }

        int result[]=selectionSort(arr);
        System.out.print("\n After sorting: ");
        for (int num:result){
            System.out.print(num+" ");
        }

    }

}
