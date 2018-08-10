package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/10 14:31
 *
 * We are given two strings, A and B.
 *
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.
 *
 * Example 1:
 * Input: A = 'abcde', B = 'cdeab'
 * Output: true
 *
 * Example 2:
 * Input: A = 'abcde', B = 'abced'
 * Output: false
 *
 * String 的contains方法使用KMP算法 时间复杂度O(n)
 *
 * 796
 */
public class RotateString {

    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
