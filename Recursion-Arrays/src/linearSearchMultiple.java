import java.util.ArrayList;

public class linearSearchMultiple {
   static ArrayList<Integer> list=new ArrayList<>();
    public void findAllIndex(int[] arr, int tar,int idx){
       if(idx==arr.length){
           return;
       }
       if(arr[idx]==tar){
        list.add(idx);
       }
       findAllIndex(arr,tar,idx+1);
   }

    public static void main(String[] args) {

    }
}
