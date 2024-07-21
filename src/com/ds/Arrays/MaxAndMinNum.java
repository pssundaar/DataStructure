package com.ds.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class MaxAndMinNum {

    public static void main(String[] args) {
        int[] num={1,990,89,35,7,28,700,3,0,8888};
       int min=num[0];
       int max=num[0];
        for(int i=1; i<num.length; i++){
            if(min > num[i]){
                min=num[i];
            }else if(max < num[i]){
                max=num[i];
            }
        }
        System.out.println("MIN " + min +" "+ "MAX "+  max);
    }
}
