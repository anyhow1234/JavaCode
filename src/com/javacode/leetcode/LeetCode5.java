package com.javacode.leetcode;

/**
 * @Description:
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 输入: "babad",输出: "bab",注意: "aba" 也是一个有效答案。
 * 输入: "cbbd",输出: "bb"
 *
 * @Author hans
 * @Date 2019/8/1 18:24
 * @Version 1.0
 */
public class LeetCode5 {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(new LeetCode5().longestPalindrome(s));
    }
    public String longestPalindrome(String s) {
        if(s == null || "".equals(s)){
            return "";
        }
        int returnFrom = 0;
        int returnTo = 0;
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length - 1; i++){
            int from = 0;
            int to = 0;
            if(chars[i] == chars[i+1]){
                from = i;
                to = i + 1;
                int k = 1;
                while (i - k >= 0 && i+1+k <= chars.length-1 && chars[i - k] == chars[i+1+k]){
                    from = i - k;
                    to = i + 1 + k;
                    k++;
                }
            }
            if(to - from > returnTo - returnFrom){
                returnTo = to;
                returnFrom = from;
            }
            if(i < chars.length - 2 && chars[i] == chars[i+2]){
                from = i;
                to = i + 2;
                int k = 1;
                while (i - k >= 0 && i+2+k <= chars.length-1 && chars[i - k] == chars[i+2+k]){
                    from = i - k;
                    to = i + 2 + k;
                    k++;
                }
            }
            if(to - from > returnTo - returnFrom){
                returnTo = to;
                returnFrom = from;
            }
        }
        return s.substring(returnFrom,returnTo + 1);
    }
}
