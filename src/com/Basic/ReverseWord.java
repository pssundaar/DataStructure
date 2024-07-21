package com.Basic;

public class ReverseWord {
    public static void main(String[] args) {
        String str= "Hello World, i am developer";
        String[] s=str.split(" ");
        String rev="";
        for(int i=s.length-1; i>=0; i--){
            rev+=s[i]+" ";
        }
        System.out.println(rev);
    }
}
