package com.ds.Arrays;

import java.util.Arrays;

public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100,110};
        int temp[]= new int[arr.length];
        int count =0;
        System.out.println(arr.length/2);
       for(int i=0, j= arr.length-1; i<arr.length/2; i++){
           temp[count]= arr[j];
           count++;
           temp[count]=arr[i];
           j--;
           count++;

       }
        if(arr.length%2 !=0 ){
            temp[arr.length-1]= arr[arr.length/2];
        }
        System.out.println(Arrays.toString(temp));

    }
}
