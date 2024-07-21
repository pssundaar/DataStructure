package com.Arrays;

public class CountAlphabets {
    public static void main(String[] args) {
        String target="shyam";
        String b= "shyamsundarp";
        boolean bool= false;
        int[] two= getCount(b.toCharArray());
       // int[] one= getCount(target.toCharArray());
        for(int i=0; i<target.length();i++){
            int index= (int)target.charAt(i)-97;
            //if(one[index] != two[index]){
            if(two[index] ==0){
                //System.out.println(false);
                bool=false;
                break;
            }else {
                bool=true;
            }
        }
        System.out.println(bool?"present":"not present");
    }
    public static int[] getCount(char[] ch){
        int[] al= new int[26];
        for(int i=0; i<ch.length; i++){
            int index= (int)ch[i]-97;
            al[index]=al[index]+1;
        }
        return al;
    }
}
