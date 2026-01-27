package org.JAVA;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();

        String a="harsh";
        String b="harsh";//here both are pointing towards same object.;
        System.out.println(a==b);

        if(fruit.equals("mango")){
            System.out.println("king of fruit");
        }
        if(fruit.equals("apple")){
            System.out.println("a sweet red fruit");
        }

        switch (fruit){
            case "Mango":
                System.out.println("king of fruit");
                break;
            case "Apple":
                System.out.println("a sweet red fruit");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            case "Grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }
        //without break it will execute all the cases below until it gets a break;
        //it directly jumps to the correct condition.

        //CLick alt+enter to get option to turn this into enhance switch or if else.

        switch (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("a sweet red fruit");
            case "Orange" -> System.out.println("round fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter a valid fruit");
        }//it has internal break condition in each statement.

        //Days in the Weekend
        int day=in.nextInt();
        switch (day){
            case 1-> {
                System.out.println("Monday");
            }
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thrusday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            default-> System.out.println("Sunday");
        }


        // Print weekends/weekdays
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            default:
                System.out.println("Sunday");

        }

        //Better way to write
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            default -> System.out.println("Weekend");
        }



    }
}