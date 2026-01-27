package org.example;


import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // int num=input.nextFloat(); this will not work as destination type is less than source type.

        //float num=input.nextInt();//data type should be compatible to do type casting;

        //type casting
        //explicitly doing type conversion
        //int a= (int)(267.55f);
        //System.out.println(a);

        //automatic type promotion in expression.
//        byte b=(byte)(a);
//        System.out.println(b);//the max value of byte is 256 so it gives 267 mod 256 which is 11.

//        byte x=40;
//        byte y=50;
//        byte z=100;
//
//        int d=x*y/z;
//        System.out.println(d);//this will convert 40*50 which exceeds 256 to int to do the operation.

        //type promotion rules:-
        //all byte,short,char are converted to int.
        //if its float,double,long whole operation is converted to these.

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d*s);

        //float +int-double=double .since double is largest type
        System.out.println(result);
    }
}
