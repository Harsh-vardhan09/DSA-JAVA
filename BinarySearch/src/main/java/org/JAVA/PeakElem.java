package org.JAVA;

public class PeakElem {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 10, 10, 12, 19};
        int x=11;
        System.out.println(findFloor(arr,x));
//        System.out.println(peakElement(arr));

    }

    //here we are not doing start=mid as we know by dry run that it runs into infinite loop
    //and if we dont do start=mid+1 search space doesnt decrease from that point
    //in binary search search space should always decrease
    //we also learn that since mid+ 1> mid so we dont need to keep mid if we know there is greater element to the right

    static int peakElement(int[] arr) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }

    static int findFloor(int[] arr, int x) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                start=mid+1;
            }else if(arr[mid]>x){
                end=mid-1;
            }

        }
        return start;
    }
}
