package com.bobo.back;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * @author Boild
 * @date 2020-05-31
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int length = candidates.length;

        //排序 少搜索一点
        Arrays.sort(candidates);

        dfs(candidates, length, target, 0, new LinkedList<>(), res);

        return res;
    }

    /**
     *
     * @param candidates 数组输入
     * @param length 数组长度
     * @param target 剩余数值
     * @param begin 本轮搜索起点下标
     * @param path 从根节点到任意节点的路径
     * @param res 结果变量集
     */
    public void dfs(int[] candidates, int length, int target, int begin,
                    Deque<Integer> path, List<List<Integer>> res) {

        if (target == 0) {
            //由于path全局只使用一份 到叶子节点需要做一次拷贝
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < length; i++) {

            //在数组有序的前提下 剪枝   ps：当前值比要搜索的目标值还要大  所以后面的都会大于目标值
            if (target < candidates[i]) {
                break;
            }
            path.add(candidates[i]);
            dfs(candidates, length, target - candidates[i], i, path, res);
            path.removeLast();

        }

    }
}
