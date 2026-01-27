package org.JAVA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Take an input of two number and print sum

        Scanner in=new Scanner(System.in);
        int num1,num2,sum;


        System.out.println("enter no 1");
        num1=in.nextInt();
        System.out.println("enter no 2");
        num2= in.nextInt();
        sum=num1+num2;
        System.out.println("the sum"+sum);

    }
}

//DRY DON'T REPEAT YOURSELF.

/*
    access modifier (will look into oops) return_type name(arguments){
        //body of the function
        return statement
    }

     */