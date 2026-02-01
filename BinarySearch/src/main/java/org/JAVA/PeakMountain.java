package org.JAVA;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakMountain {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are decreasing part of array
                //this may be answer but look left
                //this is why end!=mid-1
                end=mid;
            }else{
                //in ascending part of array
                start=mid+1;//we know that mid+1 >mid
            }
        }

        //in the end start==end and pointing to the largest number of the 2 above checks
        //start and end are always trying to find the max element in bove 2 checks
        //hence,when they are pointing to just one element that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end,they have the best possible answer till that time
        //and if we are saying that only one item is remaining hence that is the best possible answer
        return start;// or end both are same
    }
}
