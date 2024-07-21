package com.ds.level1;

import java.util.ArrayList;
import java.util.List;

public class CheckSubArrayWith0 {
    public static void main(String[] args) {
        int[] num = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
            List<Integer> temp = new ArrayList<>();
            int count = 0;
        for(int i=0; i<num.length; i++){
            temp.add(num[i]);
            if(temp.stream().mapToInt(Integer :: intValue).sum() == 0){
              System.out.println(temp);
          }
            if(i == num.length-1 && count <= num.length-1){
                count++;
                i=count -1;
                temp.clear();
            }
        }
        }
    }

