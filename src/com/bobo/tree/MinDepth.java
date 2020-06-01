package com.bobo.tree;

/**
 * @author Boild
 * @date 2020-05-26
 */
public class MinDepth {

    /**
     * 给定一个二叉树，找出其最小深度。
     *
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDep = minDepth(root.left);
        int rightDep = minDepth(root.right);
        return root.left == null || root.right == null ? leftDep + rightDep + 1 :Math.min(leftDep, rightDep) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
