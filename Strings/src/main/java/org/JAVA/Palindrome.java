package org.JAVA;

public class Palindrome {
    public static void main(String[] args) {
        String str="abcdecba";
        System.out.println(isPalindrome2(str));
    }
    static boolean isPalindrome(String str){
       if(str==null||str.length()==0) return true;
        int start=0;
        int end=str.length();
        while(start<end){
            if(str.charAt(start)==str.charAt(end-1)){
                start++;
                end--;
            }else{
                return false;
            }

        }
        return true;
    }

    static boolean isPalindrome2(String str){
        if(str==null|| str.isEmpty()) return true;
        str=str.toLowerCase();
        for (int i = 0; i <=str.length()/2 ; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
