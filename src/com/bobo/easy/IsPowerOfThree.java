package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/16 11:09
 *
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Example 1:
 *
 * Input: 27
 * Output: true
 * Example 2:
 *
 * Input: 0
 * Output: false
 * Example 3:
 *
 * Input: 9
 * Output: true
 * Example 4:
 *
 * Input: 45
 * Output: false
 *
 * 326
 */
public class IsPowerOfThree {

    /**
     * 自己写的
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        while (n > 1){
            if (n % 3 != 0){
                return false;
            }
            n /= 3;
        }
        if (n <= 0){
            return false;
        }
        return true;
    }

    /**
     * 神奇的网友的代码
     * @param n
     * @return
     */
    public boolean isPowerOfThree1(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }
}
