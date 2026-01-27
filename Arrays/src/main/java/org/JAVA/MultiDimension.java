package org.JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        /*
                1 2 3
                4 5 6
                7 8 9
         */

        Scanner in=new Scanner(System.in);
        int[][] arr2d={//imagine as an array of arrays
                {1 , 2 , 3},//0th index
                {4 , 5 },//1st index
                {6 ,7 , 8 , 9}//2nd index ->arr2D={6,7,8,9}
        };

        int[][] arr=new int[3][3];//adding no of rows is not mandatory

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {//size of each row to input col
                arr[row][col]=in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            System.out.println(Arrays.toString(arr[row]));
        }

        for  (int[] a : arr) {
            //for each column in every row
            System.out.println(Arrays.toString(a));
        }

    }
}
