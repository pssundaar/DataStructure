package com.Basic;

public class ReverseString {
    public static void main(String[] args) {
        String s= "Shyam";
       char[] ch= s.toCharArray();
        for(int i=0, j=ch.length-1; i<=(ch.length-1)/2; i++,j--){
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
        }
        //System.out.println(new String(ch));
        ReverseString.methos2();
    }
    // best approch
    public static String methos2(){
        String s= "Shyam";
        char[] ch= s.toCharArray();
        String rev="";
        for(int i=ch.length-1; i>=0; i--){
            rev+=ch[i];
        }
        System.out.println(rev);
        return rev;
    }
}
