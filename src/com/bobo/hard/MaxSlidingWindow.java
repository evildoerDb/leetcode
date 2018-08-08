package com.bobo.hard;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by evildoerDb on 2018/8/7 10:54
 *
 * 滑动窗口最大值  239
 *
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * Return the max sliding window.
 *
 * Example:
 *
 * Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 *
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k < 1 || nums.length < k){
            return new int[0];
        }

        int [] arr = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                queue.pollLast();
            }
            queue.addLast(i);
            if (queue.peekFirst() == i - k){
                queue.pollFirst();
            }
            if (i >= k -1){
                arr[index++] = nums[queue.peekFirst()];
            }
        }
        return  arr;
    }
}
