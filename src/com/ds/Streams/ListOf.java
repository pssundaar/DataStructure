package com.ds.Streams;

import java.util.Arrays;
import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,4,8,3,7,2,6,1);
        list.stream().filter(i->i%2==0).forEach(System.out::println);
    }
}
