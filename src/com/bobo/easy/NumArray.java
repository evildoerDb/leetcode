package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/3 17:56
 *
 *
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 *
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 *
 * 303
 */
public class NumArray {

    private int []nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int result = 0 ;

        for (int k = i ; k <=j ; k++){
            result+=nums[k];
        }

        return result;
    }
}
