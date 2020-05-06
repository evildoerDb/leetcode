package com.bobo.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Boild
 * @date 2020-05-06
 */
public class FirstUniqChar {

    /**
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     *
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            Integer count = map.get(s.charAt(i));
            if (null == count) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), ++count);
            }

        }

        for (int i = 0; i < s.length(); i++) {
            Integer count = map.get(s.charAt(i));
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     *
     * 只包含小写字母 可以这样解
     * @param s
     * @return
     */
    public static int firstUniqChar2(String s) {

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;

        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(firstUniqChar(s));
    }
}
