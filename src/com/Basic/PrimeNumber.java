package com.Basic;
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 112;
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if(num%i==0){
                    System.out.println(i);
                    count++;
                }
            }
            if(count == 2){
                System.out.println(" prime Number");
            }else{
                System.out.println("not prime");
            }
        }
    }
}