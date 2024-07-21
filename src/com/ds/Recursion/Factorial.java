package com.ds.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.cal(10));
    }
    public static int cal(int t){
        if(t<=1){
            return 1;
        }
        return t * cal(t-1);
    }
}
