package com.ds.Recursion;

public class sumOfInteger {
    public static void main(String[] args) {
        int i= 12;
        System.out.println(sumOfInteger.cal(i,1,0));
    }
    static int cal(int i, int d, int sum){
           if(i/d == 0) {
              return sum + i / d;
           }
        return   cal(i, d * 10, sum)  ;
       }

}
