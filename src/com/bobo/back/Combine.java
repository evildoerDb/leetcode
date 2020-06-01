package com.bobo.back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Boild
 * @date 2020-06-01
 */
public class Combine {

    /**
     * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
     * 输入: n = 4, k = 2
     * 输出:
     * [
     *   [2,4],
     *   [3,4],
     *   [2,3],
     *   [1,2],
     *   [1,3],
     *   [1,4],
     * ]
     * @param n
     * @param k
     * @return
     */
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, 1, n, k, new LinkedList<>());
        return res;
    }

    private static void backtrack(List<List<Integer>> res, int start, int n, int k, LinkedList<Integer> list) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            backtrack(res, i + 1, n, k, list);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
