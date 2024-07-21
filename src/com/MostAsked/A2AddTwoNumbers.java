package com.MostAsked;

import java.util.Arrays;

public class A2AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1 = {1,2}, l2 = {1};
        int a=sum(l1)+sum(l2);
        System.out.println(a);
        System.out.println(reverse(a,Math.max(l1.length,l2.length)+1));

    }
    public static int reverse(int target, int t){
        int sum=target, rev=0;
        int[] a= new int[t];
        while(sum !=0){
            int temp=rev*10;
            rev=temp + (sum%10);
            sum=sum/10;
        }
        return rev;
    }
    public static  int sum(int[] arr){
        int num=0;
        for(int i=0; i<arr.length; i++){
            int temp=num*10;
            num=temp+arr[i];
        }
        return num;
    }
}
