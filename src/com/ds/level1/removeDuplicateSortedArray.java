package com.ds.level1;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateSortedArray {
    public static void main(String[] args) {
        int[] num={0,0,1,1,1,2,2,3,3,4};
        Set<Integer> set= new HashSet<>();
        for(int i=0; i<num.length; i++){
            set.add(num[i]);
        }
        System.out.println(set);
    }
}
