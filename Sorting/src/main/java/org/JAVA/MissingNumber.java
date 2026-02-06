package org.JAVA;

import static org.JAVA.SelectionSort.swap;

public class MissingNumber {
    public static void main(String[] args) {

    }

    static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        
        //search for first missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }

        //case 2 return n
        return arr.length;
    }
}
