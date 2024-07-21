package com.ds.BinarySearch;

//Sorted Array
public class SearchElement {
    public static int searchNum(int[] arr, int target){
        int min=0;
        int max=arr.length;
        while(min <= max  ){
          int  mid=(min+max)/2;
            if(arr[mid] < target){
                min=mid+1;
            }else if(arr[mid] > target){
                max=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,5,6,7,8,9,10,11,45, 66,77,99};
        int target=5;
        System.out.println(searchNum(arr,target));

    }
}
