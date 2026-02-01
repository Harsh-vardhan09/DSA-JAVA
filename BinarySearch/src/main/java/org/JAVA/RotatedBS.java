package org.JAVA;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1904651796/
//better way to do it in recursion.
//fail in duplicate values


public class RotatedBS {
    public static void main(String[] args) {
        int[] arr={3,5,1};
        int target=3;
        System.out.println(search(arr,target));
        System.out.println(findPivot(arr));
    }

    static int search(int[] nums, int target){
        int pivot=findPivot(nums);
        //if you did not find a pivot it means the array is not rotated
        if(pivot==-1){
            binarySearch(nums,target,0,nums.length-1);

        }

        //if you found pivot you have found 2 asc sorted arrays
        // there are 3 cases
        if(nums[pivot]==target){
            return pivot;
        }else if (target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);


    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]) {
                end = mid - 1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]==target){
                return mid;
            }
        }
        return -1;
    }


    static int findPivotDuplicate(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if element at middle,start,end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
               //NOTE: what if these element at start and end were pivots?
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check whether end is pivot
                if (arr[end]<arr[end-1] ) {
                    return end-1;
                }
                end--;
            }

            //left side is sorted,so pivot should be in right
            else if(arr[start]<arr[mid]|| (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}
