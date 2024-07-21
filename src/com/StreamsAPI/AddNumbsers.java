package com.StreamsAPI;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class AddNumbsers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3);
       // Integer sum= list.stream().mapToInt(Integer::valueOf).sum();
        int i= list.stream().reduce(0, (a,b)->a+b);
        System.out.println(i);
    }
}
