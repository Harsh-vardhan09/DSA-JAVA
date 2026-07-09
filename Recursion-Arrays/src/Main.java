
public class Main {
    // linear search with recursion
    public static void main(String[] args) {

    }
    public boolean linearSearch(int[] arr,int tar,int idx){
        if(idx==arr.length){
            return false;
        }
        return arr[idx]==tar || linearSearch(arr,tar,idx+1);
    }
}