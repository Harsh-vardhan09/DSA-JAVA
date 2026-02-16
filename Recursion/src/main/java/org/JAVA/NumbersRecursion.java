package org.JAVA;

public class NumbersRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        // print first 5 number
        print(1);
        // if you are calling a function again and again.
        // you can treat it as a separate call in the stack.
    }

    static void print(int n){

        if(n==5){ //base condition for the recursion
            System.out.println(n);
            return;//empty return to get out of the recursion
        }

        System.out.println(n);

        //this is called tailrecursion
        //this is last function call
        print(n+1);
    }


    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}
