package com.bobo.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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


    public static List<Integer> findDisappearedNumbers2(int[] nums) {

        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num]++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }


    public static List<Integer> findDisappearedNumbers3(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -1 * Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] arr = {3,3,2,1,4,5,6,4};
        List<Integer> list = findDisappearedNumbers(arr);
        for (int i : list){
            System.out.print(i + " ");
        }
    }
}
