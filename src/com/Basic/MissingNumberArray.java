package com.Basic;

public class MissingNumberArray {
    public static void main(String[] args) {
        int[] num={201,202,204,205};
        int sum1=0;
        for(int i=0; i<=num.length-1; i++){
            sum1+=num[i];
        }
        int sum=0;
        for(int i=num[0]; i<=num[num.length-1] ; i++){
            sum+=i;
        }
        System.out.println(sum-sum1);
    }
}
