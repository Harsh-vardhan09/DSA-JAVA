package org.JAVA;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="aarsh";
        char target='h';
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char target){
        if(str.length()==0) return false;//here length is a function for calling length
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str,char target) {
        if (str.length() == 0) return false;//here length is a function for calling length

        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }

        return false;
    }
}


