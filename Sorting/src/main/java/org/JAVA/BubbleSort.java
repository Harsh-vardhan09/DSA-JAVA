package org.JAVA;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step,max item will come at the last respective index
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }

            //if you did not swap for a particular value of i,it means the array is sorted hence stop the program
            if (!swapped){//!false =true
                break;
            }
        }
    }
}