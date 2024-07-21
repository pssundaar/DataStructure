package com.Tree;

public class Preorder {
    public static void main(String[] args) {
     String[] str=   {"catch", "do","god", "dog","cat","at"};


     for(int i=0; i<str.length ; i++){
         for(int j=0; j<str.length;j++){
             if(str[i].startsWith(str[j]) && !(str[i].equalsIgnoreCase(str[j]))){
                     System.out.println(str[j]);
                 }
             }
         }
     }

}
