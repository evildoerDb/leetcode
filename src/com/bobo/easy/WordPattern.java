package com.bobo.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by evildoerDb on 2018/8/17 14:04
 *
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 *
 * Example 1:
 *
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 *
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 *
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 *
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 *
 * 290
 */
public class WordPattern {

    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()){
            return false;
        }

        HashMap map = new HashMap();
        for (int i=0; i<words.length; ++i){
            if (!Objects.equals(map.put(pattern.charAt(i), i),map.put(words[i], i))){
                return false;
            }

        }

        return true;
    }

    public static boolean wordPattern2(String pattern, String str) {
        String[] strs= str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        if(strs.length != pattern.length()){
            return false;
        }

        for(int i=0; i<strs.length; i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(strs[i])){
                    return false;
                }

            }else{
                if(map.containsValue(strs[i])){
                    return false;
                }

                map.put(c, strs[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern2(pattern,str));
    }
}
