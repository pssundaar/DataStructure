package com.Heap;

import java.util.PriorityQueue;

public class PrintHeap {
    public static void main(String[] args) {
        int[] arr= {5,8,1,4,2};
        PriorityQueue<Integer> heap= new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            heap.add(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(heap.peek()+" ");
            heap.poll();
        }
    }
}
