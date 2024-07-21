package com.ds.Arrays;

public class MountailArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int arr[]){
        if(arr.length == 0){
            return -1;
        }
        if(arr.length == 1){
            return arr[0];
        }

        int start  = 0;
        int end = arr.length -1;
        int target = 0;
        while ( start <= end ){
            int mid = (end+start)/2;
          if(mid + 1 <= arr.length){
              if(arr[mid] <= arr[mid+1]){
                  start= mid +1;
                  target=mid +1;
              }else {
                  end = mid -1;
                  target=mid;
              }
          }else{
              break;
          }
        }
        return target;
    }
}
