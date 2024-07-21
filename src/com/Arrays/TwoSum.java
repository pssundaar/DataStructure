package com.Arrays;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {1,5,7,-1,5};
        int t=6;
        List<Integer> list = new ArrayList<>();
       list.add(1);
          HashSet<Integer>  set= new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(t-arr[i])){
                System.out.println(t-arr[i]+" "+arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
    }

}
