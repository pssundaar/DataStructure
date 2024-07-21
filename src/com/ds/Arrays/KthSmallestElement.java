package com.ds.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr= {7 ,10, 4, 3, 20, 15};
       TreeSet<Integer> hs = new TreeSet<>();
       for(int i=0; i< arr.length;i++){
           hs.add(arr[i]);
       }
       int  k=3;
       int count =0;
       for (int j :hs   ) {
           if(count == k-1){
               System.out.println(j);
               break;
           }
           count++;
        }

    }
}
