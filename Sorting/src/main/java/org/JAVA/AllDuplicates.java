package org.JAVA;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class AllDuplicates {
    List<Integer> dupli=new ArrayList<>();

    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                dupli.add(arr[j]);
            }
        }
        return dupli;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
