package com.ds.Streams;

import java.util.ArrayList;

public class mapStream {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(30);marks.add(78);marks.add(26); marks.add(96);
        marks.add(79);
        marks.stream().map(i-> i+10)
                .forEach(System.out::println);
    }
}
