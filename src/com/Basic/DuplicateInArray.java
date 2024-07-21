package com.Basic;

import java.util.HashSet;

public class DuplicateInArray {
    public static void main(String[] args) {
        String[] str={"java", "Python","C","java","C++","C"};
        HashSet<String> hs= new HashSet<>();
        for(int i=0; i<=str.length-1; i++) {
            if (!(hs.add(str[i]))){
                System.out.println(str[i]);
            }
        }
    }
}
