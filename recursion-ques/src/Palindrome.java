public class Palindrome {
    static int sum=0;

    static void rev(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
    }


    static boolean palin(int n){
       return if(n==sum);
    }

    public static void main(String[] args) {
        palin(1234321);
    }
}
