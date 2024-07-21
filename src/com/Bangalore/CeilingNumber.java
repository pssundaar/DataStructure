package com.Bangalore;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr= {2,23,34,45,56,67,78,89,90};
        System.out.println(findCeiling(arr,48));
    }
    static int findCeiling(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        int mid=0; int num=0;
        while(start <= end){
            mid= (start + end)/2;
            if(target == arr[mid]){
               num= arr[mid];
               break;
            }
            else if(target < arr[mid]){
                num= target > arr[start] ? arr[start+1] : arr[start];
                end=mid-1;
            }else if(target > arr[mid]){
                num= target > arr[start] ? arr[start+1] : arr[start];
                start= mid+1;

            }
        }
        return num;
    }
}
