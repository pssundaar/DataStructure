package com.ds.Arrays;

import java.util.HashSet;

public class triplets {
    public static void main(String[] args) {
        int[] arr={12,3,4,1,6,9};
        int k= 24;
        find(arr,k);
    }
    public static void find(int[] arr, int sum){
        int arr_siz= arr.length;
        for(int i=0; i<arr_siz-2;i++){
            HashSet<Integer> hs= new HashSet<>();
            int temp=sum-arr[i];
            for(int j=i+1; j< arr_siz; j++){// i=2
                if(hs.contains(temp-arr[j])){// 12-4=8
                    System.out.println(arr[j] +" "+arr[i] +" "+ (temp-arr[j] ));
                    break;
                }
                hs.add(arr[j]);
            }
        }
    }
}
