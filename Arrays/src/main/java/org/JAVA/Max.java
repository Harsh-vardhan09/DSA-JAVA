package org.JAVA;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,9,77,89};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,4));
    }

    //array is not empty
    static int max(int[] arr){
        int maxVal=0;
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >maxVal) {
                maxVal=arr[i];
            }

        }
        return maxVal;
    }

    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] >maxVal) {
                maxVal=arr[i];
            }

        }
        return maxVal;
    }

}
