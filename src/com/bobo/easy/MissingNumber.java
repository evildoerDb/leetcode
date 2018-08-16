package com.bobo.easy;

import java.util.Arrays;

/**
 * Created by evildoerDb on 2018/8/15 14:39
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 *
 * 268
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =0 ; i < nums.length; i++){
            if (nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumber1(int[] nums) {
        int result = nums.length;
        for(int i =0 ; i < nums.length; i++){
        result = result ^ i ^ nums[i]; //a ^ b ^ b = a
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        int result = missingNumber(arr);
        System.out.println(result);
    }

}
