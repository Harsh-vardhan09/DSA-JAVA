package org.JAVA;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0); //trim removes the space ahead.we use char at to turn string into char of that index.

        if(ch>='a' && ch<='z'){ // && and operator, || or operator, ! not operator
            System.out.println("small letter");
        }else{
            System.out.println("capital letter");
        }

    }
}
