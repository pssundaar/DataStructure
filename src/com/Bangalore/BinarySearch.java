package com.Bangalore;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10,23,45,67,88};
        int start=0;
        int end= arr.length-1;
        int s=88;
        while(start <= end){
            int mid= start + (end - start) / 2;
            if(arr[mid] == s){
                System.out.println(mid+1);
                break;
            }else if(arr[mid] < s){
                start=mid+1;
            }else if(arr[mid] > s){
                end=mid;
            }
        }
    }
}
