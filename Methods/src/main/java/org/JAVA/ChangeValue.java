package org.JAVA;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array

        int[] arr={1,3,4,2,45,6};
        change(arr);//this reference the same object by making copy of the reference.
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0]=99;//here we are modifying the arr with
    }
}
