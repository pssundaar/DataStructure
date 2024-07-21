package com.Bangalore;

import javax.xml.stream.events.StartDocument;

public class CharFloornum {
    public static void main(String[] args) {
        char[] c= {'A','C','F','J'};
        char i='a';
        System.out.println(getChar(c,'G'));
    }
    public static char getChar(char[] ch, char target){
        int start =0;
        int end = ch.length-1;
        char c;
        if(target > ch[ch.length-1]){
            return ch[start];
        }
        while(start <= end){
            int mid= (start + end) / 2;
            if(target == (int)ch[mid]){
                return ch[mid];
            }else if(target <= ch[mid]){
                end = mid -1;
            }else if(target > ch[mid]){
                start = mid +1;
            }
        }
        return ch[end+1];
    }
}
