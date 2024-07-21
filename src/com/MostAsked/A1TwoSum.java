package com.MostAsked;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A1TwoSum {
    public static void main(String[] args) {
       int[]  nums = {2,7,11,15};
       int target = 26;
       Set<Integer> al= new HashSet<>();
       for(int i=0; i<nums.length; i++){
           if(al.contains(target-nums[i])){
               System.out.println(nums[i] +" "+(target-nums[i]));
           }else {
               al.add(nums[i]);
           }
       }
    }
}
