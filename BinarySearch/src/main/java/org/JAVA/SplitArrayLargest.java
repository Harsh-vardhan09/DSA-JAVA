package org.JAVA;

public class SplitArrayLargest {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]);//in the end loop will contian max element from the array
            end+=nums[i];
        }

        //binary search
        while(start<end){
            //try for the mid as potential answer
            int mid=start+(end-start)/2;
            //calculate how many pieces we can divide this in with max sum

            int sum=0;
            int pieces=1;

            for(int num:nums){
                if(sum+num>mid){
                    //you cannot add this in this sub array
                    //say you add this num in new array then sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
                if(pieces>k){
                    start=mid+1;
                }else{
                    end=mid;
                }

            }
        }
        return end;
    }
}
