package com.ds.Arrays;

import java.util.Arrays;

public class InfiniteSearch {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,9,10,11};
                //,13,15,17,18,21,22,45,56,66,67,68,};
        //        69,71,72,73,74,75,76,78,79,80,81,
        //82,84,85,86,87,88,90,91,93,94,96,97,100,101,111,123,129,130,131,132,134,135,136,139,140,150};
        int target = 140;
       System.out.println(findRange(arr,56));

    }
    public static int findRange(int[] arr, int target){
        int start=0;
        int end =1;
        while(target > arr[end]){
            System.out.println(arr[end]);
            int temp= end+1;
              end= end+(end-start +1)*2;
            start=temp;
        }
        return searchNum(arr,target,start,end);
    }
    public static int searchNum(int[] arr, int target, int min, int max){

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
}
