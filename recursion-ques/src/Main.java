
public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");
        fun(5);
    }

    static void fun(int n){
        if(n==1) {
            return;
        }
        System.out.println(n);
        fun(n-1);

    }
    static void funReverse(int n){
        if(n==1) {
            System.out.println(" " + n);
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}