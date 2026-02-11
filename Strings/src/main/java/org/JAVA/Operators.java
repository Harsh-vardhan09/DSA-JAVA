package org.JAVA;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");

        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        //when an integer is concatinated to string its converted to its wrapper class
        //integer will be converted to Integer that will call toString

        System.out.println("aarsh"+new ArrayList<>());
        System.out.println("aarsh"+new Integer(56));
//        System.out.println(new Integer(56)+new ArrayList<>());
        // we can use + in java with primitives and all other objects if atleast one is of string typw
        System.out.println(new Integer(56)+""+new ArrayList<>());//turning both to string
    }
}
