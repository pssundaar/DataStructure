package com.LeetCode.Sliding;
//https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1
public class pivotIndex {
    public static void main(String[] args) {
        pivotIndex.pivotIndex(new int[]{2,1,-1});
    }
    public static void pivotIndex(int[] nums) {
        int left = nums[0];
        int right = nums[nums.length - 1];
        for (int i = 1, j = nums.length - 2; i < nums.length; ) {
            if (i != j ) {

                if(left < right) {
                    left += nums[i];
                    i++;
                }
                else if(right < left) {
                    right += nums[j];
                    j--;
                }
            }
            if(left == right){
                System.out.println(i);
                break;
            }

        }
    }

}
