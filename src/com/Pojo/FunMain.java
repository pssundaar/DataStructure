package com.Pojo;

import java.io.IOException;
import java.util.HashMap;

public class FunMain  {

    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(1,"bcd");
        System.out.println(map.size());
        map.forEach((k,v)-> System.out.print(k +" "+ v));
    }

}
