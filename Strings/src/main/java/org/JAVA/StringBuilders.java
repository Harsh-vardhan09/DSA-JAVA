package org.JAVA;

import java.lang.StringBuilder;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            System.out.println(ch);//this will print abcd as a+1 2 3 gives abcd
            builder.append(ch);//this is mutable


        }
        System.out.println(builder);
        builder.reverse();


    }
}
