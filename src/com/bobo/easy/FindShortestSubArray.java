package com.bobo.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by evildoerDb on 2018/8/15 10:35
 *
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
 *
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
 *
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 * Note:
 *
 * nums.length will be between 1 and 50,000.
 * nums[i] will be an integer between 0 and 49,999.
 *
 * 697
 */
public class FindShortestSubArray {

    /**
     * map key 表示具体数字
     * value为长为3的数组  0 位置表示出险次数 1 位置表述出现的第一次的索引 2 位置表示出现最后一次的索引
     * @param nums
     * @return
     */
    public static int findShortestSubArray(int[] nums) {

        if (nums.length == 0 || nums == null) {
            return 0;
        }

        int degree = 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], new int[]{1, i, i});
                degree = Math.max(degree,1);
            } else {
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
                degree = Math.max(degree,temp[0]);
            }

        }

        int result = Integer.MAX_VALUE;
        for (int[] value : map.values()){
            if (degree == value[0]){
                result = Math.min(value[2] - value[1] + 1,result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        int result = findShortestSubArray(arr);
        System.out.println(result);
    }

}
