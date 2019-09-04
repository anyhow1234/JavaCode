package com.javacode.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @Author hans
 * @Date 2019/4/22 17:40
 * @Version 1.0
 */
public class LeetCode3 {
    public static void main(String[] args) {
        String str1 = "dvdf";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(str1));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        char[] charArray = s.toCharArray();
        int start = 0, size = 1;
        Map<Character,Integer> temp = new HashMap<>(charArray.length);
        temp.put(charArray[start],start);
        for(int i = start + 1; i < charArray.length; i++){
            if(temp.keySet().contains(charArray[i])){
                size = size > i - start ? size : i - start;
                start = i = temp.get(charArray[i]) + 1;
                temp = new HashMap<>(charArray.length - start);
                temp.put(charArray[start],start);
            } else {
                temp.put(charArray[i],i);
            }
        }
        size = size > temp.size()? size : temp.size();
        return size;
    }
}