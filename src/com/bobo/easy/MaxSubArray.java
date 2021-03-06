package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/16 13:51
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 *
 */
public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i =1; i < nums.length; i++){
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i -1] :0);
            max = Math.max(dp[i] , max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(maxSubArray(arr));
    }
}
