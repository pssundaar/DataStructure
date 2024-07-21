package com.ds.BinarySearch;

public class Ciling {
    public static void main(String[] args) {
        int[] arr= {1,3,44,55,66,77,88,99};
        int target =78;
        System.out.println(findCiling(arr,target));
    }
    public static int findCiling(int[] arr, int target){
        int min=0;
        int mid=0;
        int max= arr.length-1;
        while(min <= max){
             mid= (min+max)/2;
            if(target < arr[mid] ){
                max= mid-1;
            }
            else if(target > arr[mid]){
                min= mid+1;
            }else{
                return mid;
            }
        }
        System.out.println("MIDD  -- "+arr[max]);
        return -1;
    }
}
