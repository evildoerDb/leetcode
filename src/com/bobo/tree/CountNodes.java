package com.bobo.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Boild
 * @date 2020-05-26
 */
public class CountNodes {

    public int countNodes(TreeNode root) {
        int count = 0;
        if (null == root) {
            return count;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            count++;
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
        return count;
    }

    public int countNodes1(TreeNode root) {
        if (root == null){
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int countNodes2(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = countLevel(root.left);
        int right = countLevel(root.right);

        if (left == right) {
            return countNodes(root.right) + (1 << left);
        } else {
            return countNodes(root.left) + (1 << right);
        }
    }

    private int countLevel(TreeNode left) {
        int count = 0;
        while (left != null) {
            count++;
            left = left.left;
        }
        return count;
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
