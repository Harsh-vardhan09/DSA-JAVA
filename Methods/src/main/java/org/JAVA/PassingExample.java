package org.JAVA;

import static org.JAVA.ReturnString.greet;

public class PassingExample {
    public static void main(String[] args) {
        String name="aarsh-hv";
        greet(name);
    }

    private static void greet(String naam) {
        System.out.println(naam);
    }
}
