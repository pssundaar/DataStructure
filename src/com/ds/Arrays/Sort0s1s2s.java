package com.ds.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] num={1,2,0,0,2,1,1,2,0};
        int zero=0, one=0,two=0;
        for(int i=0; i<num.length; i++) {
           if(num[i]==0)
               zero++;
           if(num[i]==1)
               one++;
           if(num[i]==2)
               two++;
        }
        int index=0;
        for(int i=0; i<zero;i++)
            num[index++]=0;
        for(int i=0; i<one;i++)
            num[index++]=1;
        for(int i=0; i<two;i++)
            num[index++]=2;
        for(int i=0; i<num.length;i++)
            System.out.println(num[i]);
        }



}
