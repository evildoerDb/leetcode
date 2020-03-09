package com.bobo.medium;

import java.util.Stack;

/**
 * @author Boild
 * @date 2020-03-09
 */
public class IsValidBST {

    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack();
        double inorder = - Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (root.val <= inorder) return false;
                inorder = root.val;
                root = root.right;
            }

        }
        return true;

//        return helper(root, null);

    }

    public boolean helper(TreeNode root, TreeNode pre) {
        if (null == root) {
            return true;
        }

        helper(root.left, root);
        if (null != pre && root.val <= pre.val) {
            return false;
        }
        helper(root.right, root);

        return true;
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
