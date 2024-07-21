package com.ds.Arrays;
//Facebook
public class firstAndLastfind {
    public static void main(String[] args) {
        int[] arr= {1,2,3,7,8,9};
        int target= 7;
        firstAndLastfind firstAndLastfind= new firstAndLastfind();
        System.out.println(firstAndLastfind.searchRange(arr,target));

    }
    public int[] searchRange(int[] nums, int target) {
        int start=find(nums,target,true);
        int end=find(nums,target,false);
        return new int[]{start,end};
    }
    public static int  find(int[] nums, int target, boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
             int mid = (start + end )/2;

             if(target < nums[mid]  ){
                 end= mid -1;
             }else if(target > nums[mid]  ) {
                 start = mid +1;
             }else{
                 ans= mid;
                 if(startIndex){
                     end=mid-1;
                 }else {
                     start=mid+1;
                 }

             }
        }
        return ans;
    }

}
