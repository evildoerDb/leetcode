package com.bobo.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by evildoerDb on 2018/8/10 15:42
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 *
 * 349
 */
public class Intersection {

    /**
     * 暴力解法 O(n ^2 ) time
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list = new HashSet<>();
        for (int num1 : nums1){
            for (int num2 : nums2){
                if (num1 == num2){
                    list.add(num1);
                    break;
                }
            }
        }
        int [] arr = new int[list.size()];
        int index = 0;
        for (int i : list){
            arr[index++] = i;
        }
        return arr;
    }

    /**
     * 二分查找 O(nlogn) time
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection1(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (int i : nums1){
            if (binarySearch(i,nums2)){
                set.add(i);
            }
        }
        int [] arr = new int[set.size()];
        int index = 0 ;
        for (int i : set){
            arr[index++] = i;
        }
        return arr;
    }

    /**
     * 二分算法
     * @param i
     * @param nums2
     * @return
     */
    private static boolean binarySearch(int i, int[] nums2) {

        int left = 0;
        int right = nums2.length -1;
        while (left <= right){
            int mid = left + ((right -left) >>> 1);
            if (nums2[mid] > i){
                right = mid -1;
            }else if (nums2[mid] < i){
                left = mid +1;
            }else {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] arr1 = {1};
        int[] arr2 = {1};
        int [] result = intersection1(arr1,arr2);
        for (int i : result){
            System.out.print(i + " ");
        }
    }
}
