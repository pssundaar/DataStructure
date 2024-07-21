package com;

import java.util.HashSet;
import java.util.Set;

public class triple {
    public static void main(String[] args) {
        int[] num={12,3,4,1,6,9};
        int sum=24;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<num.length;i++){
            set.add(num[i]);
        }
        for(int i=0,j=i+1; i<num.length && j<num.length;i++){
            if(j<i){
                break;
            }else{
                if(set.contains(sum - addTwoNumbers(num[i],num[j]))){
                    int z=sum - addTwoNumbers(num[i],num[j]);
                    System.out.println(num[i]+" "+num[j]+" "+z);
                }
            }
        }
    }
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }
}
