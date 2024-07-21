package com.StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        Optional<String> s= words.stream().reduce((word1, word2)-> {
            if(word1.length() > word2.length())
                return word1;
            else
                return word2;
        });
        System.out.println(s);

    }
}
