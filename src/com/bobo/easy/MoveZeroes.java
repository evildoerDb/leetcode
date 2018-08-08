package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/8 15:50
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * 283
 */
public class MoveZeroes {

    /**
     * AC 解法
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int index = 0;
        int pos = 0;
        while (index < nums.length){
            while (index < nums.length && nums[index] != 0){
                index++;
            }
            if (index == nums.length){
                break;
            }
            pos = index;
            while (pos < nums.length && nums[pos] == 0 ){
                pos++;
            }
            if (pos == nums.length){
                break;
            }
            int temp = nums[pos];
            nums[pos] = nums[index];
            nums[index++] = temp;
        }
    }

    /**
     * 最快解法
     * @param nums
     */
    public void moveZeros(int[] nums){
        if (nums == null || nums.length == 0) {
            return;
        }

        int index = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1};
        moveZeroes(arr);
        for (int i : arr){
            System.out.print( i +" ");
        }
    }
}
