package com.SlidingProblms;

public class KthElement {
    public static void main(String[] arg) {
        int[] arr={9,5,7,3,8};
        int ans=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
