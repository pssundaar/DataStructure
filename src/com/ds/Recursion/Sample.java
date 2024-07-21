package com.ds.Recursion;

public class Sample {
    public static void main(String[] args) {
        printNumber(3);
    }
    public static void printNumber(int num){
        if(num <= 10){
            System.out.print(num+1 + " ");
            printNumber(num+1);

        }
    }
}
