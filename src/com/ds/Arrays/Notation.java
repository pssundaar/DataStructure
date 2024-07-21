package com.ds.Arrays;

import java.util.Stack;

public class Notation {
    public static void main(String[] args) {
        String[] str=  {"4", "13", "5", "/", "+"};
        Stack<String> st= new Stack<>();
        String op= "+-*/";
        for(String i: str){
            if(!op.contains(i)){
                st.push(i);
            }else{
                int index= op.indexOf(i);
                int a= Integer.valueOf(st.pop());
                int b= Integer.valueOf(st.pop());
                switch (index) {
                    case (0):
                      st.push(String.valueOf(a+b));
                    break;
                    case (1):
                        st.push(String.valueOf(a-b));
                        break;
                    case (2):
                        st.push(String.valueOf(a*b));
                        break;
                    case (3):
                        st.push(String.valueOf(a/b));
                        break;
                }
            }
        }
        System.out.println(st.pop());

    }
}
