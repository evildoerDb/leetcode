package com.bobo.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by evildoerDb on 2018/8/13 15:34
 *
 * 两数之和
 *  *
 *  * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *  *
 *  * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *  *
 *  * 示例:
 *  *
 *  * 给定 nums = [2, 7, 11, 15], target = 9
 *  *
 *  *
 *  * 所以返回 [1, 2]
 */
public class TwoSum2 {

    /**
     * 使用hashmap解法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i+1};
            }
            map.put(nums[i], i+1);
        }
        return new int[2];
    }


    /**
     * 两根指针
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2){
            return result;
        }
        int left = 0;
        int right = nums.length -1;
        while (left < right){
            if (target == nums[left] + nums[right]){
                result[0] = left +1;
                result[1] = right +1;
                return result;
            }else if (target < nums[left] + nums[right]){
                right--;
            }else {
                left++;
            }
        }

        return result;
    }


}
