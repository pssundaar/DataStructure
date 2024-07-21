package com.LeetCode.Sliding;
//3. Longest Substring Without Repeating Characters
public class WithoutrepeatingChar {
    public static void main(String[] args) {
        String str= "abcabcbb";
        System.out.println( WithoutrepeatingChar.lengthOfLongestSubstring(""));
    }
    public static String lengthOfLongestSubstring(String s){
        if(s.length() == 0){
            return "";
        }
        if(s.length() ==1){
            return s;
        }
        String ans="";
        String temp=s.charAt(0)+"";
        char[] ch= s.toCharArray();
        for(int i=0, j=1; i<ch.length && j<ch.length; ){
            if(ch[i] != ch[j] && !temp.contains(String.valueOf(ch[j]))){
                temp=temp+ch[j];
                j++;
            }else {
                ans = ans.length()< temp.length() ? temp:ans;
                i++;
                j=i+1;
                temp= String.valueOf(s.charAt(i));
            }
        }
        ans= ans.length()< temp.length() ? temp:ans;
        return ans;
    }
}
