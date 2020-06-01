package com.bobo.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Boild
 * @date 2020-05-28
 */
public class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            res = 0;
            for (int i = 0; i < size; i++) {
                root = queue.poll();
                res += root.val;

                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
            }
        }
        return res;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
