package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/3 17:35
 * <p>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 * <p>
 * 58
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if (strs.length == 0) {
            return 0;
        }
        return strs[strs.length - 1].length();
    }

    public static int lengthOfLastWord2(String s) {
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                cnt++;
            } else if (cnt > 0) {
                return cnt;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord2(" a"));
    }
}
