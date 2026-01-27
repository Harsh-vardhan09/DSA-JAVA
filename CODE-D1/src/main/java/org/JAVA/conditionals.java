package org.JAVA;


public class conditionals {
    public static void main(String[] args) {
        /*
       syntax of if statement:
       if(boolean expression true or false){
       //body
       }else{
       //do this
       }
       */

        int salary=25000;

//        if(salary > 20000){
//            salary=salary+2000;
//        }else{
//            salary=salary+1000;
//        }

        //multiple if else statement
        if(salary>10000){
            salary+=2000;
        }else if(salary>20000){
            salary+=3000;
        }else{
            salary+=1000;
        }

        System.out.println(salary);
    }
}