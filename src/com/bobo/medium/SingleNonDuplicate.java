package com.bobo.medium;

/**
 * Created by evildoerDb on 2018/8/21 15:54
 *
 * Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.
 *
 * Example 1:
 * Input: [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * Example 2:
 * Input: [3,3,7,7,10,11,11]
 * Output: 10
 * Note: Your solution should run in O(log n) time and O(1) space.
 *
 * 540
 */
public class SingleNonDuplicate {


    /**
     * O(n)的解法
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        int result = nums[0];
        for (int i = 1 ; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

    /**
     * O(logn)的解法
     * @param nums
     * @return
     */
    public static int singleNonDuplicate1(int[] nums) {

        //left 一定是一组数据开始的那个数据
        int left =0;
        int right = nums.length -1;
        while (left < right){
            int mid = left + (right - left) / 2;
            //mid的位置也是一组数据 的开头的数字
            if (mid % 2 == 1){

                mid--;
            }
            //如果不想等  说明这个数字在左半区域
            if (nums[mid] !=nums[mid+1]){
                right = mid;
            }else {
                left = mid + 2;
            }
        }
        //left 是一组数据开头的位置  要么就是单个的数字
        return nums[left];
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate1(arr));
    }
}
