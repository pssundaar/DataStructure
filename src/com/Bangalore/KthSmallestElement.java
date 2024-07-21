package com.Bangalore;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr= {7 ,10, 4, 3, 20, 15};
        PriorityQueue<Integer> pq= new PriorityQueue<>(arr.length);
        for(int i: arr){
            pq.add(i);
        }
        System.out.println(pq.peek());

    }
}
