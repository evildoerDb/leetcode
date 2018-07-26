package com.bobo.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by evildoerDb on 2018/7/26 10:45
 *
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 *
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
 *
 * Example 1:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 *
 * 496
 */
public class NextGreaterElement {

    /**
     * 暴力解法
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr = new int[nums1.length];
        //存放nums2的索引和值得映射
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums2.length ; i++){
            map.put(nums2[i],i);
        }

        for (int i = 0 ; i < nums1.length; i++){
            int index = map.get(nums1[i]);
            while(index < nums2.length){
                if (nums2[index] > nums1[i]){
                    arr[i] = nums2[index];
                    index = nums2.length;
                }
                index++;
            }
            if (index == nums2.length){
                arr[i] = -1;
            }
        }

        return arr;
    }


    /**
     * 优雅解法
     *
     * 单调栈的解法
     *
     * 单调栈找出右边离它最近的比他大的数
     * @param findNums
     * @param nums
     * @return
     */
    public int[] nextGreaterElement2(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++){
            if (map.get(findNums[i]) == -1){

            }
        }
//            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }


    /**
     * 单调栈解法  自己写
     * @param nums1
     * @param nums2
     * @return
     */
    public static int [] nextGreaterElement3(int [] nums1 , int [] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i < nums2.length; i ++){
            while (!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(),nums2[i]);

            }
            stack.push(nums2[i]);

        }

        while (!stack.isEmpty() && stack.peek()!=null){
            map.put(stack.pop(),-1);
        }

        for (int i = 0; i < nums1.length; i++ ){
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
    }

    public static void main(String[] args) {
        int [] num1 = {4,1,2};
        int [] num2 = {1,3,4,2};
        int [] arr = nextGreaterElement3(num1,num2);
        for (int i : arr){
            System.out.print(i +" ");
        }
    }
}
