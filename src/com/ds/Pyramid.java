package com.ds;
//
//            1
//          2 3
//          4 5 6
//          7 8 9 10
public class Pyramid {
  public static void main(String[] args) {
        Pyramid.print();
  }
  static void print(){
    for(int i=1; i<=10; i++){
        for(int j=i; j <i; j++){
          System.out.print(j);
        }
        System.out.println();
    }
  }
}

