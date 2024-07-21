package com.MostAsked;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A3ThreeSum {
    public static void main(String[] args) {
        int[] arr= {-1,0,1,2,-1,-4};
        int target= 0;
        Set<Integer> set= new HashSet<>();
        for (int i:arr) {
            set.add(i);
        }
       for(int i=0; i<arr.length-1;  i++){
           for(int j=i+1; j<arr.length;j++){
               if(set.contains(target-(arr[i]+arr[j]))){
                   System.out.println(target-(arr[i]+arr[j]) +" "+ arr[i]+" "+arr[j] );
               }
           }
       }
    }
}
