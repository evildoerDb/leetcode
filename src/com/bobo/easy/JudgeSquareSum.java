package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/17 15:34
 *
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 *
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 * Example 2:
 * Input: 3
 * Output: False
 *
 * 633
 */
public class JudgeSquareSum {


    /**
     * binary search
     * @param c
     * @return
     */
    public static boolean judgeSquareSum(int c) {
        if (c < 0){
            return false;
        }

        int left =0;
        int right = (int)Math.sqrt(c);

        while (left <= right){
            int result = left * left + right * right;
            if (result < c){
                left++;
            }else if (result > c){
                right--;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2));
    }
}
