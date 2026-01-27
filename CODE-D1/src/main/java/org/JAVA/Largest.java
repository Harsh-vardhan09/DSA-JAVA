package org.JAVA;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        //largest of three no
//        int max=a;
//           if(b>max){
//               max=b;
//           }else if(c>max){
//               max=c;
//           }

        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
