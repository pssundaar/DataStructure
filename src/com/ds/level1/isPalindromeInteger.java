package com.ds.level1;

public class isPalindromeInteger {
    public static boolean isPalindrome(int x) {
        if(x < 10 && x > 0){
            return true;
        }
        if(x < 0){
            return false;
        }
        String str= String.valueOf(x);
        String r1="";
        String r2="";
        for(int i =0; i< str.length() /2 ; i++){
            r1=r1+str.charAt(i);
            r2=r2+x%10;

            x= x/10;
        }
        if(r1.equalsIgnoreCase(r2)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int x = -121;
        System.out.println(  isPalindromeInteger.isPalindrome(x));
    }
}
/*
 int r,sum=0,temp;
  int n=454;//It is the number variable to be checked for palindrome

  temp=n;
  while(n>0){
   r=n%10;  //getting remainder
   sum=(sum*10)+r;
   n=n/10;
  }
  if(temp==sum)
   System.out.println("palindrome number ");
  else
   System.out.println("not palindrome");
 */