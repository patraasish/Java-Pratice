package com.pratice.dsa.sorting;

public class BubbleSortDemo {

    public static int[] bubbleSort(int[] arr){
        int size= arr.length;
        int temp=0;

        System.out.println(size);

        for(int i=0;i<size;i++){

            for(int j=0;j<size-1;j++)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
//            for(int k=0;k<arr.length;k++){
//                System.out.print(arr[k]+" ");
//            }

         //   System.out.println();
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[]={4,2,1,6,18};

        System.out.print("Before Sorting: ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

       int sortedArray[] =bubbleSort(arr);

       System.out.print("After Sorting: ");
       for(int i=0;i< arr.length;i++){
           System.out.print(arr[i]+" ");
       }



    }
}
