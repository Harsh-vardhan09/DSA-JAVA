package org.JAVA;

public class scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //System.out.println(nums);//we cant use nums here because its in the function scope
        {
            //a=78; //already initialized outside the block in same method so cant reinitialized.
            a=100;//reassign the original value to new one.
            int c=99;
            //values initialized in the block stay in the block
        }

        int c=199; //we can reinitialized outisde the box
        //System.out.println(c);
        System.out.println(a);


        //scope in for loop
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
            //int a=10; //cant re initialize since its already initialized outisde
        }

        //System.out.println(i);//cant use i since its in for loop

    }

    static void random(int marks){
        int nums=67;
        System.out.println(nums);
    }
}
