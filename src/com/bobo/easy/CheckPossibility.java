package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/16 17:39
 *
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 *
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * Note: The n belongs to [1, 10,000].
 *
 *
 */
public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++){
            min = Math.min(min,nums[i]);
        }
        //TODO
        return min != nums[nums.length -1];
    }

}
