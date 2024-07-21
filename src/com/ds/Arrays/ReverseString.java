package com.ds.Arrays;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s= "123456";
        char[] c = s.toCharArray();
        for(int i=0 , j = c.length-1; i < c.length/2; i++, j--){
            char temp= c[i];
            c[i]=c[j];
            c[j]= temp;
        }
        System.out.println(c);
    }
}
