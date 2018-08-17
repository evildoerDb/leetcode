package com.bobo.easy;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by evildoerDb on 2018/7/31 18:04
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 *
 * 14
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        if (strs!= null && strs.length > 0) {

            Arrays.sort(strs);

            char[] first = strs[0].toCharArray();
            char[] second = strs[strs.length - 1].toCharArray();

            for (int i = 0; i < first.length; i++) {
                if (second.length > i && second[i] == first[i]) {
                    result.append(second[i]);
                } else {
                    return result.toString();
                }
            }
        }
        return result.toString();

    }
}
