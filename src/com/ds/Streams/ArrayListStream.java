package com.ds.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStream {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(20);al.add(4);al.add(9);
        al.add(2); al.add(6);


        al.stream().filter(x-> x%2==0).sorted()
                .forEach(System.out::println);
        //or
        List<Integer> l = al.stream().filter(x-> x%2==0).sorted()
                                     .collect(Collectors.toList());
        System.out.println(l);
    }
}
