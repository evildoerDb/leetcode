package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/26 14:17
 *
 * Input: 5
 * Output: True
 * Explanation:
 * The binary representation of 5 is: 101
 *
 * Input: 7
 * Output: False
 * Explanation:
 * The binary representation of 7 is: 111.
 * Example 3:
 * Input: 11
 * Output: False
 * Explanation:
 * The binary representation of 11 is: 1011.
 * Example 4:
 * Input: 10
 * Output: True
 * Explanation:
 * The binary representation of 10 is: 1010.
 *
 * 693
 */
public class HasAlternatingBits {

    public static boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);

        return !str.contains("00") && !str.contains("11");
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(3));
    }

    /**
     * 网上最优解
     * @param n
     * @return
     */
    public static boolean hasAlternatingBits1(int n) {
         /*
        n =         1 0 1 0 1 0 1 0
        n >> 1      0 1 0 1 0 1 0 1
        n ^ n>>1    1 1 1 1 1 1 1 1
        n           1 1 1 1 1 1 1 1
        n + 1     1 0 0 0 0 0 0 0 0
        n & (n+1)   0 0 0 0 0 0 0 0
        */

        n = n ^ (n>>1);
        return (n & n+1) == 0;
    }
}
