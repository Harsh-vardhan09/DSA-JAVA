package org.JAVA;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //take input from user till user does not press X or x.

        int ans=0;
        while(true){
            System.out.println("enter the operator");
            //take the operator as an input
            char op=in.next().trim().charAt(0);

            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                //input two number
                System.out.println("enter two numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                    break;
                }else if(op=='-'){
                    ans=num1-num2;
                    break;
                }else if(op=='*'){
                    ans=num1*num2;
                    break;
                }else if(op=='/'){
                    ans=num1/num2;
                    break;
                }else{
                    ans=num1%num2;
                    break;
                }

            }else if(op=='X'||op=='x'){
                break;
            }else{
                System.out.println("invalid operator");
                break;
            }
        }
        System.out.println(ans);
    }
}
