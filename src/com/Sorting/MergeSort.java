package com.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {6,3,9,5,2,8};
        MergeSort mergeSort= new MergeSort();
        mergeSort.divide(arr,0,arr.length-1);
    }
    public void divide(int[] arr, int i, int j){
       if(i >= j)
           return;
      int mid= i+(j-i)/2;
      divide(arr,i,mid);
      divide(arr,mid+1,j);
        System.out.println(i+" "+mid+" "+j);

    }
}
