package com.medium.questions.Array;

import java.util.HashMap;
import java.util.HashSet;

//nums = [8, 7, 2, 5, 3, 1]
//        target = 10
//
//        Output:
//
//        Pair found (8, 2)
//        or
//        Pair found (7, 3)
public class FIndSum {
    public static void main(String[] args) {
        int[] nums={8,7,2,5,3,1};
        int target = 10;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
           if(map.containsKey(target-nums[i])){
               System.out.printf("Pair found (%d, %d)",
                       nums[map.get(target - nums[i])], nums[i]);
           }
           map.put(nums[i],i);
        }
        }

}
