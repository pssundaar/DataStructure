package com.ds;

import java.util.Arrays;
// 67,34,48,2,19
// i  j
//34,67,48,2,19
//    i  j

public class BubbleSort {

    public static int[] sort(int[] arr){
        int temp;
        for(int i=0;  i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                     temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={67,34,48,2,19};
        Arrays.stream(BubbleSort.sort(arr)).forEach(System.out::println);
    }
}
