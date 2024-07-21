package com.ds.Arrays;

import java.util.PriorityQueue;

public class KthLagestelement {
    public static void main(String[] args) {
        int[] num={7,10,4,3,20,15};

        PriorityQueue<Integer> pq= new PriorityQueue<>(5);
        for(int i= 0; i<num.length; i++) {
            pq.add(num[i]);
        }
        int k=1;
        for(int i=0; i<k; i++){
            if(i==k-1){
                System.out.println(pq.peek());
            }else
                pq.poll();
        }
    }
}
