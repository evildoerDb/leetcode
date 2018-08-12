package com.bobo.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by evildoerDb on 2018/8/10 17:41
 *
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * 217
 */
public class ContainsDuplicate {

    /**
     * 利用hash表 弱智型的解法
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    /**
     * 使用1.8中的stream
     * @param nums
     * @return
     */
    public boolean containsDuplicate1(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
