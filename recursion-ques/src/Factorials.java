public class Factorials {
    public static void main(String[] args) {
        System.out.println(factorials(5));
    }
    static int factorials(int n){
        if(n<=1){
            return 1;
        }
        return n * factorials(n-1);
    }
}
