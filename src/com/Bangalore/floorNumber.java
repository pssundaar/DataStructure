package com.Bangalore;

public class floorNumber {
    public static void main(String[] args) {
        int[] a= {9,12,15,17,20};
        System.out.println(getFloorNummber(a, 10));
    }
    public static int getFloorNummber(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;
        int num = -1;
        while (start <= end){
            int mid= (start + end ) /2;
            if(target == arr[mid])
                return arr[mid];
            else if(target > arr[mid]){
                num =  target < arr[mid]  ? arr[mid-1] : arr[start];
                start= mid +1;
            }else if(target < arr[mid]){
                num =  target < arr[mid]  ? arr[mid-1] : arr[start];
                end = mid -1;
            }
        }
        return num;
    }
}

