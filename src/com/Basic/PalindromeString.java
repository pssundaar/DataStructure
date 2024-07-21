package com.Basic;

public class PalindromeString {
    public static void main(String[] args) {
        String s= "MADAM";
        String rev="";
        for(int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equalsIgnoreCase(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
