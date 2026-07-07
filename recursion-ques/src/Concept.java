public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //fun(n--);// this will lead to
        // infinte recursion and stack overflow
        // n-- vs --n are not same
        fun(--n);
    }
}
