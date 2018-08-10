package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/10 17:06
 *
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * 242
 */
public class IsAnagram {

    /**
     * 比直接使用s.charAt(i)速度要快
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        int [] arr = new int[26];
        if (s.length() != t.length()){
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for (int i = 0 ; i < ch1.length; i++){
            arr[ch1[i] - 'a']++;
        }
        for (int i = 0 ; i < ch2.length; i++){
            arr[ch2[i] - 'a']--;
        }
        for (int i = 0 ; i < 26; i++){
            if (arr[i] != 0){
                return false;
            }
        }
        return true;

    }
}
