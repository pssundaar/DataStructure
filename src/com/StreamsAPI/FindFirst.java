package com.StreamsAPI;

import java.util.stream.Stream;

public class FindFirst {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
        //Method 1
        //System.out.println(stringStream.findFirst());
        // Method 2
        System.out.println(stringStream.reduce((f, s) -> f).orElse(null));
    }
}
