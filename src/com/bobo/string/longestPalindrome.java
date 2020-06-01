package com.bobo.string;

/**
 * @author Boild
 * @date 2020-05-24
 */
public class longestPalindrome {

    /**
     * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
     *
     * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
     * @param s
     * @return
     */
    public static int longestPalindrome(String s) {
        int[] arr = new int[128];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            arr[c - 'A']++;
        }
        int length = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                length += arr[i];
            } else {
                length += arr[i] - 1;
                flag = true;
            }
        }

        return flag ? length + 1 : length;
    }

    public static void main(String[] args) {
        String s = "abccccddefg";
        System.out.println(longestPalindrome(s));
    }
}
