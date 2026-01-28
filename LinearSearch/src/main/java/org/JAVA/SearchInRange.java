package org.JAVA;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,25};
        int target=3;

        System.out.println(linearSearch(arr,target,1,4));
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for(int index=start;index<=end;index++){
            //check for the element at every index if it is = target
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statement
        //hence not found
        return -1;
    }
}
