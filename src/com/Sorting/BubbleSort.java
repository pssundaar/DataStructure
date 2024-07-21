package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {5,2,1,4};
       BubbleSort bubbleSort = new BubbleSort();
       bubbleSort.sort(arr,0,1,0);
        System.out.println(Arrays.toString(arr));
    }
    public void sort(int[] arr, int a, int b, int count) {
        for(int z=0; z<arr.length-2; z++) {
            for (int i = a, j = b; i < arr.length && j < arr.length; i++, j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
