package com.ds.Arrays;

import java.util.Arrays;

public class MergerTwoArrays {
    public static void main(String[] args) {
        int[] a={1,3,5};
        int[] b={2,4,6};
        int[] m= new int[a.length+b.length];
        for(int i=0,j=0; i<m.length; i++){
            if(a.length >i){
                m[i]=a[i];
            }else{
                m[i]=b[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(m));
    }
}
