package com.bobo.refers_to_offer;

/**
 * @author Boild
 * @date 2020-05-20
 */
public class FindGreatestSumOfSubArray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxSum = nums[0];
        int thisSum = maxSum;
        for (int i = 1; i < nums.length; i++) {
            thisSum = (thisSum < 0) ? nums[i] : thisSum + nums[i];
            maxSum = Math.max(thisSum, maxSum);
        }
        return maxSum;
    }
}
