package com.ds.level1;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s=  "()[{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        if(s==""){
            return false;
        }
        Stack<Character> sc= new Stack<>();
        for(char c : s.toCharArray()){
            if( c== '(' || c== '{' || c=='[') {
                sc.push(c);
            }else if( c== ')' && !sc.isEmpty() && sc.peek() == '('){
                sc.pop();
            }else if( c== ']' && !sc.isEmpty() && sc.peek() == '['){
                sc.pop();
            }else if( c== '}' && !sc.isEmpty() && sc.peek() == '{'){
                sc.pop();
            }else {
                return false;
            }
        }
        return sc.isEmpty();
    }
}
