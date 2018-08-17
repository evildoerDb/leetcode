package com.bobo.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/8/17 11:24
 *
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 *
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 *
 * The order of output does not matter.
 *
 * Example 1:
 *
 * Input:
 * s: "cbaebabacd" p: "abc"
 *
 * Output:
 * [0, 6]
 *
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 *
 */
public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        if (s.length() >= p.length()){
            for (int i = 0; i < s.length() - p.length(); i++){
                int[] temp = new int[256];
                for (int j = i; j < s.length() && j < i + p.length();j++ ){
                    temp[s.charAt(j)]++;
                }
                for (int k = 0; k < p.length(); k++){
                    temp[p.charAt(k)]--;
                }
                for (int k = 0; k < 256; k++){
                    if (k == 255 && temp[255] == 0){
                        list.add(i);
                    }
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String s ="cbaebabacd";
        String p = "abc";
        List<Integer> list = findAnagrams(s,p);
        for (int i : list){
            System.out.print(i + "");

        }
    }
}
