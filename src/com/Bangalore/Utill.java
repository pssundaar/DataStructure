package com.Bangalore;

public class Utill {
    public static void main(String[] args) {
        int[] arr= {2,23,34,45,56,67,78,89,90};
        int target= 90;
        int start=0;
        int end=arr.length;
        int mid=0;
        while(start < end){
            mid=( end + start )/ 2;
            if( arr[mid] == target){
                System.out.println(mid);
                break;
            }
            if( target < arr[mid]){
                end= mid;
            }else if(target > arr[mid]){
                start = mid;
            }
        }
    }
}
