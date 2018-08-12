package com.bobo.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by evildoerDb on 2018/8/10 15:14
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 * 169
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < length; i++){
            if (map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i],++value);
            }else {
                map.put(nums[i],1);
            }
            if (map.get(nums[i]) > (length >> 1)){
                return nums[i];
            }
        }
        return -1;

    }

    /**
     * 假设超过一半次数的数为A  其他为B
     * A 出现一次 count加一  其他数出现一次 count-1
     * 剩下的那个就是只出现一次的数
     * @param nums
     * @return
     */
    public static int majorityElement3(int[] nums) {
        int count=0;
        int result = 0;
        for (int num: nums) {
            if (count==0){
                result = num;
            }
            if (num != result){
                count--;
            }else{
                count++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement3(arr));
    }
}
