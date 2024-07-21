package com.ds.Arrays;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findRoate(arr));
    }
    public static int findRoate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int target=0;
        while (start <= end){
            int mid = start+end / 2;
            if(arr[mid +1] <= arr.length ){
                if(arr[mid] <= arr[mid + 1]){
                    target= mid +1;
                    start= mid +1;
                }else if(arr[mid] >= arr[mid + 1]) {
                    target = mid;
                    end = mid ;
                }
            }else{
               break;
            }
        }
        return  target;
    }


}
