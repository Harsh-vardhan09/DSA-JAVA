package org.JAVA;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,78,88);
        done("arrs","vars","cars","jars");
        multiple(2,3,"hello","how","are","you");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void done(String ...args){
        System.out.println(Arrays.toString(args));
    }

    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }

    // we can give 0 or more arguments which will come as array output
    //we can do this for all data types and it doesnt have to be v it can be anything
    //variables length should always come at end
}
