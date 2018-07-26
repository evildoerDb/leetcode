package com.bobo.easy;

import java.util.Stack;

/**
 * Created by evildoerDb on 2018/7/26 15:55
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *     The maximum number of consecutive 1s is 3.
 *
 *     485
 */
public class FindMaxConsecutiveOnes {

    /**
     * 使用栈的解法
     * @param nums
     * @return
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] == 1){
                stack.push(nums[i]);
            }else {
                max = Math.max(max,stack.size());
                stack.clear();
            }
        }
        return Math.max(max,stack.size());
    }

    /**
     *  优化的解法
     * @param nums
     * @return
     */
    public static int findMaxConsecutiveOnes2(int[] nums) {
        int max = 0;
        int index = 0;
        for (int i : nums){
            if (i ==0){
                index = 0;
            }else {
                ++index;
                max =  max > index ? max: index;
            }
        }

        return max ;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,0,1};
        int max = findMaxConsecutiveOnes2(arr);
        System.out.println(max);
    }
}
