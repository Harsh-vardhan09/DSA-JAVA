package org.JAVA ;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //swap number
//        int temp=a;
//        a=b;
//        b=temp;
//            swap(a,b);
//        System.out.println(a+" "+b);
        
        String name="aarsh";
        changeName(name);
        System.out.print(name);
        
    }

    private static void changeName(String name) {
        name="rahul";
    }


    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        //this is passing value of the variables
        //this will only be valid in this since its in function scope
        //there will be no change in original
        
    }

}
