package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/26 14:11
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 */
public class SingleNumber {

    /**
     * 任何一个数 和其它数异或两次 结果还是任何数
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i= 1; i < nums.length ; i++){
            result ^= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2};
        int result = singleNumber(arr);
        System.out.println(result);
    }
}
