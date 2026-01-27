package org.JAVA;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
//        System.out.println(greet());
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name");
        String naam=in.next();
        String personlaized=myGreet(naam);
        System.out.println(personlaized);
    }

    static String myGreet(String name) {
        String message= "hello " +name;
        return message;
    }


    static String greet(){
        String greeting="how are you";
        return greeting;
    }
}

