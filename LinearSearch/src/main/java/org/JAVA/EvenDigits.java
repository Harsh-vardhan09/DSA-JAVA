package org.JAVA;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args) {
//        int[] nums={12,345,2,6,7896};
        int[] nums={252};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count=0;

        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;

    }
        //function to check whether a number contains even no of digit or not
    static boolean even(int num){
        int numberOfDigit=digits2(num);

        /*
                if(numberOfDigit % 2==0){
                    return true;
                 }
                return false;
         */
        return numberOfDigit % 2 == 0;
    }

    //count number of digits in a number
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }

        int count=0;

        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    //using string len to
    static boolean isString(int num){
        String str=num +"";
        int len=str.length();
        if(len%2==0){
            return true;
        }
        return false;
    }
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }

        return (int)(Math.log10(num)) + 1; //this converts 256 to 2.2 which in int is 2 + 1 which is 3 digits in 256 which is true
    }

}
