package com.ds.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class utill {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        int[] arr={2,4,5,1,66,12,90,23};
       int count=0;
       for(int i=0; i<arr.length; i++){

               count += arr[i];

       }
        System.out.println(count);//236500


        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));

    }
}
