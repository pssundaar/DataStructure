package com.StreamsAPI;

import java.util.Arrays;
import java.util.List;

public class SumUsingreduce {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList( 1,2,3);
        Integer i= array.stream().reduce(0,(a,b)-> a+b);
        System.out.println(i);
    }
}
