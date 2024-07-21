package com.ds.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num={10,20,30};
        for(int i=0, j= num.length-1;i<num.length/2; i++, j--){
            int temp= num[j];
            num[j]= num[i];
            num[i]=temp;
        }
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] +" ");
        }
    }
}
