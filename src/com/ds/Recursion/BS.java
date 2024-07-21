package com.ds.Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10,12,14};
        int targer= 14;
        BS.find(arr,targer,0, arr.length);

    }
    public static void find(int[] arr, int t, int start, int end){

        int mid = (end + start) / 2;
        if(arr[mid] == t){
            System.out.println(arr[mid] + " index =" + mid );
        }
       else if( t <  arr[mid]){
            find(arr,t,start, mid );
        }
        else{
            find(arr,t,mid,end);
        }
    }

}
