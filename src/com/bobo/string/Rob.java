package com.bobo.string;

/**
 * @author Boild
 * @date 2020-05-24
 */
public class Rob {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int prePre = nums[0];
        int pre = Math.max(nums[0], nums[1]);
        int current = pre;
        for (int i = 2; i < nums.length; i++) {

            current = Math.max(pre, prePre + nums[i]);
            prePre = pre;
            pre = current;
        }
        return current;
    }
}
