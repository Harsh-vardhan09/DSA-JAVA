package org.JAVA;



public class Main {
    public static void main(String[] args) {

        //find whether 14 exist in array or not
        //if no value found,return -1
        //if in best case it only does one comparison
        //you do not find the target item.iterate/go through every item and then in the end it says I did not find it\

        int[] arr={18,12,9,14,77,50};//unsorted array
        int target=77;

        System.out.println(linearSearch2(arr,target));
    }

    //search the target and return the element

    //search in the array:return index if item found else =-1
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for(int index=0;index<arr.length;index++){
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

    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){//here length is a variable
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

    //search the target and return true or false
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }

        for(int index=0;index<arr.length;index++){
            //check for the element at every index if it is = target
            int element=arr[index];
            if(element==target){
                return true;
            }
        }

        return false;
    }
}