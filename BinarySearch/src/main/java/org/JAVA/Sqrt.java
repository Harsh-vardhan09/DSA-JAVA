package org.JAVA;

//https://leetcode.com/problems/sqrtx/submissions/1923434700/?envType=problem-list-v2&envId=wris5yw7
public class Sqrt {
    public static void main(String[] args) {
        int x=1;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x) {
        long start=0;
        long end=x;
        int ans=0;
        if(x<2) return x;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid<x){
                start=mid+1;
                ans=(int)(mid);
            }else if(mid*mid>x){
                end=mid-1;
            }else{
                return (int)(mid);
            }
        }
        return ans;
    }
}
