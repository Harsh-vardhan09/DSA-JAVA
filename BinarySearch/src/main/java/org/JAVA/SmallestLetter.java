package org.JAVA;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char target='c';
        System.out.println(nextGreatestLetter(arr,target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;

//            if (letters[mid] < target) {
//                start = mid + 1;
//            } else if (letters[mid] > target) {
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }

            //this is same as above when equal we want ot move right but if we move left mid-1 in else mid==target its wrong.
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;   // includes equal case
            }


        }
        return letters[start % letters.length];
    }

    //return smallest number >=target

}
