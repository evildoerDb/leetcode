package com.bobo.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/8/10 13:50
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 * Example:
 *
 * Input:
 * [ ]
 *
 * Output:
 * [5,6]
 */
public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[(nums[i] - 1) % nums.length] += nums.length;
        }
        for (int i = 0; i < nums.length; i++){
            //要是小于的话  刚好等于数组长度的数就会漏掉
            if (nums[i] <= nums.length){
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(arr);
        for (int i : list){
            System.out.print(i + " ");
        }
    }
}
