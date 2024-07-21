package com.SlidingProblms;

public class Utill {
    public static void main(String[] args) {
        int[] arr={1,4,7,9,10,3,66,7,88,8888,1};
        Utill utill = new Utill();
        utill.printArrya(arr);

    }
    public void printArrya(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void printHi(){
        System.out.println("hello World ");
    }
}

