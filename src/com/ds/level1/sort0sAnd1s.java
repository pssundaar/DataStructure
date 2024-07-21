package com.ds.level1;

import java.util.Arrays;

public class sort0sAnd1s {
    public static void main(String[] args) {
        int[] num= { 1, 0, 1, 0, 1, 0, 0, 1 };
            int count =0;
            for(int i=0; i< num.length; i++){
                if(num[i] ==0){
                    count++;
                }
                }
            for(int i=0; i<num.length;i++){
                if(count != 0){
                    num[i]=0;
                    count--;
                }else{
                    num[i]=1;
                }
            }
            System.out.println(Arrays.toString(num));
        }
}
