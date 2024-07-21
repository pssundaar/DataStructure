package com.Basic;

public class Fabonacci {
    public static void main(String[] args) {
        fab(0,1,10);
    }
    public static void fab(int pre, int num, int target){
        int p=pre;
        int n= num;
        if(num < target){
            if(pre+num < target) {
                System.out.print(pre + num + " ");
            }
            fab(num,pre+num,target);

        }



    }
}
// 0 1 -> 1
//
