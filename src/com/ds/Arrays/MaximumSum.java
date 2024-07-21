package com.ds.Arrays;

public class MaximumSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,5,2,3,6};
        int k= 3;
        System.out.println( sumMax(arr,k));
    }

    private static int sumMax(int[] arr, int k) {
        int ms=0;
        int ws=0;
        for(int i=0; i<k; i++){
            ws=ws+arr[i];
        }
        for(int i=k; i<arr.length;i++){
            ws=(ws+arr[i])- arr[i-k];
            ms=Math.max(ms,ws);
        }
        return ms;
    }
}
