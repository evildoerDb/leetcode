package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/31 16:13
 *
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1.
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 *
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Note:
 *
 * You may assume that all elements in nums are unique.
 * n will be in the range [1, 10000].
 * The value of each element in nums will be in the range [-9999, 9999].
 *
 *
 * 704
 */
public class Search {

    public static int search(int[] nums, int target) {


        int left = 0;
        int right = nums.length -1;
        while (left <= right){

//            int medium = (left + right) / 2;  这是不安全的做法
            int medium = left + ((right - left) >>> 1);
            if (target == nums[medium]){
                return medium;
            }else if (target > nums[medium]){
                left = medium +1;
            }else {
                right = medium -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12};

        int result = search(arr,9);
        System.out.println("result = "+ result);

    }
}
