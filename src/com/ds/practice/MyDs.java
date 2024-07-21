package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyDs {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> hash;
    public MyDs(){
        this.list = new ArrayList<>();
        this.hash = new HashMap<>();
    }

    public void insert(int value){
        if(hash.get(value) !=null){
            return;
        }
        int index= list.size();
        list.add(value);
        hash.put(value,index);

    }
    public void delete(int value){
       if(hash.get(value) !=null){
           list.remove(hash.get(value));
           hash.remove(value);
        }else{
           System.out.println("No element present");
       }
    }
    public int search(int value){
        if(hash.get(value) !=null){
            return hash.get(value);
        }else{
            System.out.println("No element present");
            return -1;
        }

    }
}
