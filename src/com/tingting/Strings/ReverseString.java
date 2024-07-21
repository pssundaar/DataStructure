package com.tingting.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s= "Shyam";
        System.out.println( rev(s.toCharArray()));
    }
    public static String  rev(char[] s){
        for(int i=0, j= s.length-1; i<(s.length-1)/2; i++, j--){
            char temp= s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        return new String(s);
    }
}
