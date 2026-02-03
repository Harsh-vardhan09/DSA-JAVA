package org.JAVA;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    //search in the row provided between the cols
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }else if(matrix[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target ){
        int rows=matrix.length;
        int cols=matrix[0].length;//be cautious matrix may be empty

        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rstart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        //run the loop till two rows are remaining
        while(rstart<(rEnd-1)){
            //while this is true it will have more than two rows
            int mid=rstart+(rEnd-rstart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }else if(matrix[mid][cMid]<target){
                rstart=mid;
            }else{
                rEnd=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of two rows
        if(matrix[rstart][cMid]==target){
            return new int[]{rstart,cMid};
        }
        if(matrix[rstart+1][cMid]==target){
            return new int[]{rstart+1,cMid};
        }

        //search in first half
        if(matrix[rstart][cMid-1]>=target){
            return binarySearch(matrix,rstart,0,cMid-1,target);
        }
        //search in 2nd half
        if(matrix[rstart][cMid+1]<=target && target<=matrix[rstart][cols-1]){
            return binarySearch(matrix,rstart,cMid+1,cols-1,target);
        }
        //search in 3rd half
        if(matrix[rstart+1][cMid-1]>=target){
            return binarySearch(matrix,rstart +1,0,cMid-1,target);
        }
        //search in 4th  half
        else{
            return binarySearch(matrix,rstart +1,cMid+1,cols-1,target);
        }
    }
}
