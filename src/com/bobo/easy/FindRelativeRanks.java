package com.bobo.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by evildoerDb on 2018/8/15 11:19
 *
 *
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 *
 * Example 1:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks according to their scores.
 *
 * 506
 */
public class FindRelativeRanks {

    public  static String[] findRelativeRanks(int[] nums) {
        int[] temp = new int[nums.length];
        HashMap<Integer,String> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }
        Arrays.sort(nums);
        int left =0,right = nums.length -1;
        while (left < right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;right--;

        }
        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                map.put(nums[i],"Gold Medal");
            }else if (i == 1){
                map.put(nums[i],"Silver Medal");
            }else if (i == 2){
                map.put(nums[i],"Bronze Medal");
            }else {
                map.put(nums[i],(i + 1)+"");
            }
        }
        String [] strs = new String[nums.length];
        for (int i = 0 ; i < temp.length; i++){
            strs[i] = map.get(temp[i]);
        }
        return strs;
    }

    public static void main(String[] args) {
        int[] nums = {10,3,8,9,4};
        String[] strs = findRelativeRanks(nums);
        for(String string : strs){
            System.out.print(string +" ");
        }
    }
}
