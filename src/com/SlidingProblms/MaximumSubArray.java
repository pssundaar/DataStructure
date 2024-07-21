package com.SlidingProblms;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr= {1,9,-1,-2,7,3,-1,2};
        int target =4;
        System.out.println( MaximumSubArray.BestSol(arr,target));
    }
    public static int BestSol(int[] arr, int target)
    {
        int windowSum=0;
        for(int i=0;i<target; i++){
            windowSum+=arr[i];
        }
        int maxsum=windowSum;
        for(int i=target;i<arr.length;i++){
            windowSum=(windowSum +arr[i])-arr[i-target];
            maxsum=Math.max(maxsum,windowSum);
        }
        return  maxsum;
    }
    public static int  secondSol(int[] arr, int taget){
        int sb=taget;
        int ans=0; int count=0;
        int temp =0;
        for(int i=0; i<arr.length; i++){
            temp=temp+arr[i];
            if(i == sb-1) {
                ans = Math.max(temp, ans);
            }
            if(i > sb-1){
                temp=temp-arr[count++];
                ans = Math.max(temp, ans);
            }
        }
        return ans ;
    }
    public int bruteSol(int[] arr){
        int sb=3;
        int temp =0;
        int temp2=0;
        for(int i=0;i<arr.length-1; i++) {
            for(int j=i; j<i+3 && j<arr.length-1; j++){
                temp2+=arr[j];
            }
            temp=Math.max(temp,temp2);
            temp2=0;
        }
       return temp;
    }
}
