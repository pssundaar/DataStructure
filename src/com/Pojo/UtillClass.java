package com.Pojo;

import java.util.TreeSet;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class UtillClass {
    public static void main(String[] args) {
        Predicate<String> pred= i-> i.length()==10;
        if(pred.test("Shyam")){
            System.out.println(true);
        }else
            System.out.println(false);

        BiPredicate<String, String> bi=
                (i1,i2)-> i1.equals(i2);
        System.out.println(bi.test("hello","Hello"));
    }

}
