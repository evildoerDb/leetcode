package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/8 15:40
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * Example:
 *
 * Input: 38
 * Output: 2
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 *              Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 *
 * 258  没有任何循环 递归的在o(1)的时间里做出来
 */
public class AddDigits {

    public int addDigits(int num) {
        if (num ==0){
            return 0;
        }else if (num % 9 == 0){
            return 9;
        }else {
            return num % 9;
        }
    }
}
