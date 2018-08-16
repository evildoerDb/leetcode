package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/16 14:33
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 *
 * 172
 */
public class TrailingZeroes {

    public static int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }



    public static void main(String[] args) {

        System.out.println(trailingZeroes(6));
    }
}
