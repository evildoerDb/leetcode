package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/10 14:20
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example:
 * Given a = 1 and b = 2, return 3.
 *
 * Credits:
 * Special thanks to @fujiaozhu for adding this problem and creating all test cases.
 *
 * 371
 */
public class GetSum {

    public static int getSum(int a, int b) {
        while (b!=0) {
            int temp = a ^ b;
            b = (a&b) << 1;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(10,20));
    }
}
