package org.JAVA;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empId=in.nextInt();
        String dept=in.next();

        //Employee id and department
        switch(empId){
            case 1:
                System.out.println("kunal");
                break;
            case 2:
                System.out.println("varun");
                break;
            case 3:
                System.out.println("employee no 3");
                switch(dept){
                    case "IT":
                        System.out.println("It department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("NO department entered");
                }
                break;
            default:
                System.out.println("enter a correct emp id");
        }


        //Better way to write
        switch (empId) {
            case 1 -> System.out.println("kunal");
            case 2 -> System.out.println("varun");
            case 3 -> {
                System.out.println("employee no 3");
                switch (dept) {
                    case "IT" -> System.out.println("It department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("NO department entered");
                }
            }
            default -> System.out.println("enter a correct emp id");
        }


    }
}
