package com.ds.Arrays;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int A[] = {1,2,3,7 };
        boolean[] b = new boolean[Arrays.stream(A).max().getAsInt()];
        for(int i =0; i<A.length; i++){
            int j= A[i];
            b[j-1]= true;
        }
        for(int i=0; i<b.length; i++){
            if(b[i] == false){
                System.out.println(i+1);
            }
        }
    }
}
