package com.StreamsAPI;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLast {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");

            // Method 1
      //  System.out.println(stringStream.reduce((f,l)-> l).orElse(null));
        // method 2
     //   System.out.println( stringStream.skip(stringStream.count()-1).findFirst());
        //Method 3
        System.out.println(stringStream.sorted(Collections.reverseOrder()));

    }
}
