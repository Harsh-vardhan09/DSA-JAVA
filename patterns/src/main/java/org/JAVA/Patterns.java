package org.JAVA;

public class Patterns {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern2(int n){
        for (int row = 1; row < n; row++) {
            //for every row,run the col
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed we need to give new line
            System.out.println();
        }
    }
    

    static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            //for every row,run the col
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            //when one row is printed we need to give new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n-row+1; col++) {//n- row +1 since the rows start from 1
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {//n- row +1 since the rows start from 1
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow=row>n?2*n-row:row;
            for (int col = 0; col <totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow=row>n?2*n-row:row;
            for (int s = 0; s < n-totalColsInRow; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n-row; s++) {
                System.out.print("  ");
            }
            for (int col = row; col>=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col<=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 1; row <= 2*n; row++){
            int  c=row>n?2*n-row:row;
            for (int s = 0; s < n-c; s++) {
                System.out.print("  ");
            }
            for (int col = c; col>=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col<=c ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        int original=n;
        n=2*n;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int atEveryIndex=original-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

}