package com.Basic.LeetCodeBasics;

public class RunningSum {
    public static void main(String[] args) {
        int[] j={1,2,3,4};
        int[] ans=RunningSum.runningSum(j);
        for(int i=0; i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] runningSum(int[] nums) {
        if(nums.length ==1){
            return nums;
        }
        int[] ans=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            ans[i]=sum;;
        }
        return ans;
    }
}