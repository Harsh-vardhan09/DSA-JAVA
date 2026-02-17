package org.JAVA;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=6;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        //if there is return type we make sure to return the sub recursion call
        //returning is important
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,start,mid-1);
        }
        return search(arr,target,mid+1,end);
    }
}
