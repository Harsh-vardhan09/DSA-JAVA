package org.JAVA;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="Aarsh var";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());//creates a new object since this is immutable
        name.indexOf('r');
        System.out.println(name.indexOf('h'));
        System.out.println("   aarsh   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
