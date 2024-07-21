package com.LinkedList;
/*
5 if a prime number
4 if multiple of 4 and divisible by 6
3 if even number
1 if its odd number
 */
public class Utill {

    public static void reverseLL(Linkedlist.Node head){
       int[] arr= {10, 36, 54,89,12};
       for(int i=0; i<arr.length; i++){
           int sum =0;
           sum=sum+checkPrime(arr[i]);
           sum=sum+checkBoth(arr[i]);
           sum=sum+checkEven(arr[i]);
           sum=sum+checkOdd(arr[i]);
           System.out.println(arr[i]+" ->" + sum);
       }
    }
    public  static int checkPrime(int target){
        int count = 0;
        for(int i =1; i< target; i++){
            if(target % i == 0){
                count++;
            }
        }
        if(count == 2){
            return 5;
        }else{
            return 0;
        }
    }
    public static int checkBoth(int target){
        if(target % 4!=0 && target % 6==0){
            return 4;
        }else{
            return 0;
        }
    }
    public static int checkEven(int target){
        if(target % 2!=0){
            return 3;
        }else{
            return 0;
        }
    }
    public static int checkOdd(int target){
        if(target % 2==0){
            return 1;
        }else{
            return 0;
        }
    }
}
