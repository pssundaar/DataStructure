package com.ds.practice;

public class Test {
    public static void main(String[] args) {
        MyDs ds= new MyDs();
        ds.insert(2);
        ds.insert(3);
        ds.insert(4);

        ds.delete(3);
        System.out.println(ds.search(4));
        System.out.println(ds.search(3 ));
    }
}
