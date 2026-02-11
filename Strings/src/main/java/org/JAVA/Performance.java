package org.JAVA;

public class Performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            System.out.println(ch);//this will print abcd as a+1 2 3 gives abcd
            series=series+ch;//new string object is created everytime and appending new char in it
            //waste of storage


        }
        System.out.println(series);
    }
}
