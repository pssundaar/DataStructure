package com.ds.level1;

import java.util.HashMap;
/*
Find a pair with the given sum in an array
Given an unsorted integer array, find a pair with the given sum in it.
Input:  nums = [8, 7, 2, 5, 3, 1], target = 10
 Output:  Pair found (8, 2)  or  Pair found (7, 3) */
public class FindAPairWithTheGivenSumInAnArray {

    public static void findpair(int[] num, int sum){
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0, j=1; i<num.length; i++){
            if(hm.containsKey(sum -num[i])){
                System.out.println(num[i] +" "+ (sum - num[i]));
            }else{
                hm.put(num[i],i);
            }
        }
    }
    public static void main(String[] args) {
        int[] num= {8, 7, 2, 5, 3, 1};
        int sum = 10;
      FindAPairWithTheGivenSumInAnArray.findpair(num,sum);
    }
}
