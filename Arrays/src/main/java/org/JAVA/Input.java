package org.JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //Arrays of primitives
//        int[] arr=new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=95;
//        arr[3]=65;
//        arr[4]=76;
//        System.out.println(arr[4]);

        //input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int num : arr) {//for every element in array,print the element.
//            System.out.print(num + " ");//here num represent element of the array.
//        }

//        System.out.println(arr[5]);//index out of bound in array

        //arrays of string
        String[] str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));//turn the array to string and print it.

        //modify
        str[1]="jai";
        System.out.println(Arrays.toString(str));

    }
}
