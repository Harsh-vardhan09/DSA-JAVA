package org.JAVA;

public class Shadowing {
     static int x=90;//this is shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x);//90

        int x;// the class variable at line 4 is shadowed by this

        //System.out.println(x);//(this is declaration)scope will begin when value in initialized

        x=40; //this is initialization
        System.out.println(x);//40


        fun();//90
    }

    static void fun(){
        System.out.println(x);
    }
}
