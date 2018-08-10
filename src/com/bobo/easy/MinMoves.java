package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/10 17:58
 */
public class MinMoves {

    public int minMoves(int[] nums) {
        int sum = nums[0];
        int min = sum;
        for (int i = 1; i < nums.length; i++){
            min = Math.min(min,nums[i]);
            sum += nums[i];
        }
        return sum - min * nums.length;
    }


    public int minMoves1(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int x : nums) {
            if (x < min) {
                min = x;
            }
        }
        int count = 0;
        for (int x : nums) {
            count += x - min;
        }
        return count;
    }

}
