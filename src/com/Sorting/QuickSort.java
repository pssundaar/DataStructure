package com.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9};
        QuickSort quickSort= new QuickSort();
        quickSort.recursion(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public void recursion(int[] arr, int start, int end){
        int p= patrition(arr,start,end);
        if(start < p-1){
            patrition(arr,start,p-1);
        }
        if(p< end){
            patrition(arr,p,end);
        }
    }
    public int patrition(int[] arr, int start, int end){
        int pivot= arr[(start+end)/2];
        while(start <= end){
                while( arr[start] < pivot) {
                    start++;
                }
                while(arr[end] > pivot) {
                    end--;
                }
                if(start <= end){
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
        }
        return start;
    }
}
