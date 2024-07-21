package com.ds.Arrays;

/*
int[] A={1,2,3,1,4,5,2,3,6} K=3
1,2,3-> 3, 2,3,1->3, 3,1,4->4, 1,4,5->5
o/p= 3,3,4,5,5,5,6->
 */
public class MaximumNumberInGivenTarget {
    public static void main(String[] args) {
        int[] A={1,2,3,1,4,5,2,3,6} ;
        int K=3;
        findMaximum(A,K);
    }
    public static void findMaximum(int[] arr, int k){
        int max=0;
        for(int i=0; i<=k; i++){
           max= mathMax(arr[i],max);

        }
        System.out.print(max+" ");
        for(int i=k; i<=arr.length-1; i++){
            int num=mathMax(arr[i-2],arr[i-1]);
            max=mathMax(num,arr[i]);
            System.out.print(max+" ");
        }
    }
    public static int mathMax(int i, int j){
        if(i<j)
            return j;
        else
            return i;
    }
}
