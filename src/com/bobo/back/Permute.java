package com.bobo.back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Boild
 * @date 2020-06-01
 */
public class Permute {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, nums.length, new LinkedList<>(), res);
        return res;
    }

    private static void backtrack(int[] nums, int length, LinkedList<Integer> list, List<List<Integer>> res) {
        if (list.size() == length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (list.contains(nums[i])) continue;
            list.add(nums[i]);
            backtrack(nums, length, list, res);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(permute(arr));
    }
}
