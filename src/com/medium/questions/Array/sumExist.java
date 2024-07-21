package com.medium.questions.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class sumExist {
    public static void main(String[] args) {
        int[] inp =   { 3, 4, -7, 3, 1, 3, 1, -4, -2, 2 };
        int temp=inp[0];
        ArrayList as= new ArrayList();
        as.add(inp[0]);
        for(int i=0, j= 1; j<inp.length;){
            as.add(inp[j]);
                temp = temp+inp[j];
                if(temp == 0){
                    System.out.println(as);
                    as.clear();

                }else{
                    j++;
                }
            }
        }
    }

