package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/16 11:02
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 *
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 *
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 *
 * Input: 218
 * Output: false
 *
 *
 */
public class IsPowerOfTwo {

    public static boolean isPowerOfTwo(int n) {


        while (n > 1){
            if (n % 2 != 0){
                return false;
            }
            n = n >>> 1;
        }
        if (n <= 0){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(218));
    }
}
