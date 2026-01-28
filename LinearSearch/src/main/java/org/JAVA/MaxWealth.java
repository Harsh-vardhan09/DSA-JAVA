package org.JAVA;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        //person=row
        //account=col
        for (int person = 0; person < accounts.length; person++) {
            //when you start a new col take a new rowSum
            int rowSum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum+=accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall ans
            if (rowSum>max) {
                max=rowSum;
            }
        }
        return max;
    }
}
