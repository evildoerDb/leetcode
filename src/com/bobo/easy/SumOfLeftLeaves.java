package com.bobo.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by evildoerDb on 2018/8/13 15:21
 *
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 *
 * 404
 */
public class SumOfLeftLeaves {

    /**
     * BFS
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || root.left == null && root.right == null) {
            return 0;
        }

        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode nowHead = queue.poll();

            if(nowHead.left != null && nowHead.left.left == null && nowHead.left.right == null) {
                res += nowHead.left.val;
            }
            if(nowHead.left != null) {
                queue.offer(nowHead.left);
            }
            if(nowHead.right != null) {
                queue.offer(nowHead.right);
            }
        }
        return res;
    }


    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
