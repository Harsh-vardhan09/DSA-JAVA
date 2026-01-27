package org.JAVA;


import com.sun.security.jgss.GSSUtil;

public class Overloading {
    public static void main(String[] args) {
        fun("hello");
        fun(44);
        fun(44,55);
        demo("hello");
        demo(44,55,66);
        //you can not leave empty in case of overloading variable arguments
        //they decide which one to run during compile time
    }
    static void fun(int a){
        System.out.print("first one: ");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.print("string one: ");
        System.out.println(name);
    }
    static void fun(int a,int b){
        System.out.print("sum is: ");
        System.out.println(a+b);
    }

    static void demo(int ...v){
        System.out.println(v);
    }

    static void demo(String ...v){
        System.out.println(v);
    }

    //number of args should be diff or type must be different
}
