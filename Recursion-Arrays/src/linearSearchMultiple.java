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

    public ArrayList<Integer> findAllIndex2(int[] arr, int tar,int idx){
        ArrayList<Integer> list=new ArrayList<>();
        if(idx==arr.length){
            return;
        }

//        this will contain answer for that function call only
        if(arr[idx]==tar){
            list.add(idx);
        }
        ArrayList<Integer> ansFromBelowCalls =findAllIndex2(arr,tar,idx+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
    public static void main(String[] args) {

    }
}
