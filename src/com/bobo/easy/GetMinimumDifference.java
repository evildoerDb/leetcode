package com.bobo.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by evildoerDb on 2018/8/13 14:32
 *
 *
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *     \
 *      3
 *     /
 *    2
 *
 * Output:
 * 1
 *
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 *
 * 530
 */
public class GetMinimumDifference {

    int minNum = Integer.MAX_VALUE;
    Integer pre = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null){
            return minNum;
        }
        getMinimumDifference(root.left);
        if (pre != null){
            minNum = Math.min(minNum,Math.abs(root.val - pre));
        }
        pre = root.val;
        getMinimumDifference(root.right);
        return minNum;
    }




    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
