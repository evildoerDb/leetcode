package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/16 14:14
 *
 * In a given integer array nums, there is always exactly one largest element.
 *
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 *
 * If it is, return the index of the largest element, otherwise return -1.
 *
 * Example 1:
 *
 * Input: nums = [3, 6, 1, 0]
 * Output: 1
 * Explanation: 6 is the largest integer, and for every other number in the array x,
 * 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
 *
 *
 * Example 2:
 *
 * Input: nums = [1, 2, 3, 4]
 * Output: -1
 * Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
 *
 * 747
 */
public class DominantIndex {

    public static int dominantIndex(int[] nums) {
        if (nums == null){
            return -1;
        }
        int length = nums.length;
        int max = nums[0];
        int index = 0;
        for (int i = 1; i < length; i++){
            if (max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != max && max < 2 * nums[i]){
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 0};
        System.out.println(dominantIndex(arr));
    }
}
