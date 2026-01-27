package org.JAVA;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // print numbers from 1 to 5

        /*
        syntax of for loop
        for(initialization;condition;increment decrement){
        //body
        }
         */


//        for(int i=0;i<=5;i+=1){
//            System.out.println(i);
//        }

        // print number 0 to n
//        Scanner inp= new Scanner(System.in);
//        int n=inp.nextInt();

//        for (int i = 0; i < n; i++) {
//            //System.out.print(i+" ");
//            System.out.println("hello world");
//        }

        //while loops
        /*
        syntax of while loop
        while(condition){
          //body
        }
         */

//        int num=1;
//        while(num<n){
//            System.out.println(num);
//            num+=1;
//        }

        //while loop is used when how many times its going to run.

        //do-while loop

        /*
        do{
        //body
        }while(condition)
         */
        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<5);



    }
}
