package com.SlidingProblms;

import java.util.HashSet;
import java.util.Set;

public class SecondLargestNm {
    public static void main(String[] args) {
        int[] arr ={3,4,7,1,9};
        int ans=printNum(arr,0);
        int sec = printNum(arr,ans);
        System.out.println(sec);
    }
    public static int printNum(int[] arr, int max){
        int ans=0;
        for(int i=0; i<arr.length;i++){
            if(max != arr[i]) {
                if (arr[i] > ans) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
}
