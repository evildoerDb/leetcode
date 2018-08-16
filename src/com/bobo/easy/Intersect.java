package com.bobo.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by evildoerDb on 2018/8/15 15:24
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 *
 * 350
 */
public class Intersect {

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums1){
            if (map.containsKey(num)){
                int value = map.get(num);
                map.put(num,value+1);
            }else {
                map.put(num,1);
            }
        }
        for (int num : nums2){
            if (map.containsKey(num)){
                int value = map.get(num);
                list.add(num);
                if (value == 1){
                    map.remove(num);
                }else {
                    map.put(num,value -1);
                }
            }
        }
        int[] arr = new int[list.size()];
        int index = 0;
        for (int num : list){
            arr[index++] = num;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int [] arr = intersect(arr1,arr2);
        for (int i : arr){
            System.out.print(i + "　");
        }
    }
}
