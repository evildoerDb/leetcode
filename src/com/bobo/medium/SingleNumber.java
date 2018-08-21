package com.bobo.medium;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by evildoerDb on 2018/8/21 15:04
 *
 *
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 *
 * Example:
 *
 * Input:  [1,2,1,3,2,5]
 * Output: [3,5]
 *
 * 260
 */
public class SingleNumber {

    /**
     * 一般解法
     * @param nums
     * @return
     */
    public static int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        Set<Integer> set = map.keySet();
        int index=0;
        for (int i : set){
            if (map.get(i) == 1){
                arr[index++] = i;
            }
            if (index == 2){
                break;
            }
        }
        return arr;
    }

    /**
     * 使用位运算的解法
     * @param nums
     * @return
     */
    public static int[] singleNumber1(int[] nums) {
        int result = 0;
        int anotherResult = 0;
        for (int num : nums) {
            result ^= num;
        }
        int rightOne = result & (~result + 1);
        for (int num : nums) {
            if ((num & rightOne) != 0) {
                anotherResult ^= num;
            }
        }
        return new int[]{anotherResult,anotherResult ^ result};
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,1,3,2,5};
//        int[] result = singleNumber(arr);
//        for (int i : result){
//            System.out.print(i + " ");
//        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
        System.out.println(dateFormat.format(new Date()));
    }
}
