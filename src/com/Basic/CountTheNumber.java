package com.Basic;

public class CountTheNumber {
    public static void main(String[] args) {
        int num=76411;
        int sum=0;
       // System.out.println(num%10);
        while(num !=0){
            sum+= num%10;
          //  System.out.println(sum);
            num=num/10;
        }
        System.out.println(sum);
    }
}
