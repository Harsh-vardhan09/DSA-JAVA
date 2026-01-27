package org.JAVA;

public class Main {
    public static void main(String[] args) {
        // store a roll no.
        int a=19;

        // store a  person name
        String name="aarsh";

        //store 5 roll no.
        int r1=66;
        int r2=55;
        int r3=77;

        //store 5 roll no
//        int[] rollNo=new int[5];
//        //or directly
//        int[] roll2={23,34,45,56,67};

        int[] ros;//declaration of array ros is getting defined in the stack
        ros =new int[5];// initialization:actually here object is being created in heap memory.
        //dynamic memory allocation:assign memory space during execution.
        //new is used to create an object from the method.

        System.out.println(ros[1]);//this will give 0 since its done by default.

        String[] arr=new String[5];
        System.out.println(arr[2]);//this will give null as output
        //null is special literal by default value what reference variable point to.

        String str=null;//we cant give null to primitive data types.
        //int t=null;//this will give error
    }

    //all the datatype must be same in array
    //each element in the array is a object where the ref variable of the element is stored.
    //array is not continous in java its in heap
    //it may or may not be continous depends on jvm.

    //Syntax
    //datatype[] variable_name=new datatype[size]
}