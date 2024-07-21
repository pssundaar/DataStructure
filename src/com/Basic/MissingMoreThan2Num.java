package com.Basic;

public class MissingMoreThan2Num {
    public static void main(String[] args) {
        int[] num={11,12,14};
        int count=num[0];
        for(int i=0; i<=num.length-1; ){
            if(count == num[i]){
                i++;
                count++;
            }else{
                System.out.println(count);
                count+=1;
            }
        }
    }
}
