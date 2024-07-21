package com.ds.Recursion;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(  Fibonachi.print(4));
    }
    public static int print(int i){
      if(i< 2){
          return i;
      }
       return print(i-1) + print(i-2);
    }
}
