package com.ds.Strings;

public class ReverseWordsInaGivenString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String[] str= s.split("\\.");
        for(int i=0, j=str.length-1; i<str.length/2; i++, j--){
            String temp= str[i];
            str[i]= str[j];
            str[j]= temp;
        }
        s="";
        for(int i=0; i<str.length; i++){
            s+=str[i]+".";
        }
        System.out.println(s);
    }
}
