package com.bobo.tree;

/**
 * @author Boild
 * @date 2020-05-28
 */
public class FindElements {
    private TreeNode root;
    public FindElements(TreeNode root) {
        root.val = 0;
        TreeNode head = root;
        helpBuild(head);
    }

    private void helpBuild(TreeNode head) {
        if (head == null) {
            return;
        }
        if (head.left != null) {
            head.left.val = head.val * 2 + 1;
            helpBuild(head.left);
        }
        if (head.right != null) {
            head.right.val = head.val * 2 + 2;
            helpBuild(head.right);
        }

    }

    public boolean find(int target) {
        TreeNode head = root;
        return helpFind(head, target);
    }

    private boolean helpFind(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        }
        if (root.val > target) {
            return false;
        }

        return helpFind(root.left, target) || helpFind(root.right, target);
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
