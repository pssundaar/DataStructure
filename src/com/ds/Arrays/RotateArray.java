package com.ds.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int r= -1; int k;
        String[] str={"A","B","C","D","E"};

        k = r % str.length;
        System.out.println(k);
        System.out.println(str.length);
       String[] aans= Merge2Arrays(Arrays.copyOfRange(str,k,str.length),
                Arrays.copyOfRange(str,0,k));
        for(int i=0; i<aans.length;i++){
            System.out.print(aans[i] + " ");
        }

    }
    public static String[] Merge2Arrays(String[] a1, String[] a2){
        String[] ans =new String[a1.length+a2.length];
        for(int i=0; i<a1.length; i++){
            ans[i]=a1[i];
        }
        for(int i=0; i<a2.length; i++){
            ans[a1.length+i]= a2[i];
        }
        return ans;
    }
    public static String[] reverse(String[] str){
        String[] strng=new String[str.length];
        if(str.length > 0){
            for(int i=str.length-1, j=0; i>=0; i--){
                strng[j]=str[i];
                j++;
            }
        }
        return strng;
    }

}

