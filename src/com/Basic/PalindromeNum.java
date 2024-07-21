package com.Basic;

public class PalindromeNum {
    public static void main(String[] args) {
        int num= 32123;
        int original=num;
        int rev=0;
        while(num !=0){
            rev = rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);
        System.out.println(original);
        if(rev == original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
       // System.out.println(rev);
    }
}
