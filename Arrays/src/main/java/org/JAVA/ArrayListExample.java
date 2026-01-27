package org.JAVA;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //size is fixed internally
        //say arraylist fills by some amount
        //it will create a new arraylist of double size
        //old elements gets copied in new one
        //old one is deleted


        //syntax

        ArrayList<Integer> list=new ArrayList<>(10);


//        list.add(67);
//        list.add(57);
//        list.add(77);
//        list.add(87);
//        list.add(97);
//
//        System.out.println(list.contains(67));
//        list.set(0,99);
//        list.remove(2);

//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }



    }
}
