package org.JAVA;

public class FiboComplexity {
    public static void main(String[] args) {
//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboFormula(i));
//        }

        System.out.println( fiboFormula(50));

    }
    //formula for fibo which uses 1.6^n time for solution which can directly give answer fo the problem
    //this is  the formula found for fibo no using complexity method of linear recurence.


    static int fiboFormula(int n){
      // double ans= (Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5);
        //we can remove the less dominating term
        double ans= (Math.pow(((1+Math.sqrt(5))/2),n))/Math.sqrt(5);
       return (int)(ans);
    }
}