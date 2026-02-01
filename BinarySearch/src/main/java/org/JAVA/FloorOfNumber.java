package org.JAVA;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(floor(arr,target));
    }

    //return greatest no <=target
    static int floor(int[] arr, int target){
        //but what if the target is greater than greatest number in the array
        //it will give -1

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find the middle elemennt
            //int mid=(start+end)/2;
            //this might be possible that(start+end) exceeds the range of int in java
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
