package org.JAVA;

import java.util.Scanner;

public class ArmstrongNumber {



    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        System.out.println(isArmstrong(n));

        for (int i = 150; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i+" ");
            }
        }

    }

    // three digit armstrong
    static boolean isArmstrong(int n){
       int original=n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;

            sum += rem*rem*rem;
            n=n/10;
        }

        return sum == original;
    }
}
