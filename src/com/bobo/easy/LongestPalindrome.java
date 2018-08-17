package com.bobo.easy;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by evildoerDb on 2018/8/15 14:23
 *
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 *
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * Note:
 * Assume the length of given string will not exceed 1,010.
 *
 * Example:
 *
 * Input:
 * "abccccdd"
 *
 * Output:
 * 7
 *
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        int[] arr = new int[256];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            arr[chars[i]]++;
        }
        int times = 0;
        for (int i = 0 ; i < 256; i++){
            times= times+(arr[i] >>> 1);
        }
        return times * 2 + 1 > s.length() ? s.length(): times * 2 + 1;

    }

    public static void main(String[] args) {
        String string = "abccccdd";
        int result = longestPalindrome(string);
        System.out.println(result);
//        long current=System.currentTimeMillis();//当前时间毫秒数
//        long zero=current/(1000*3600*24)*(1000*3600*24)-TimeZone.getDefault().getRawOffset();
//        System.out.println(new Date(zero -518400000).toLocaleString());
    }
}
