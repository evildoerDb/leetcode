package com.bobo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Boild
 * @date 2020-06-01
 */
public class KthLargest {

    /**
     * 给定一棵二叉搜索树，请找出其中第k大的节点。
     * @param root
     * @param k
     * @return
     */
    public static int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            while (!stack.isEmpty() || root != null) {

                if (null != root) {
                    stack.push(root);
                    root = root.right;
                } else {
                    root = stack.pop();
                    list.add(root.val);
                    if (list.size() == k) {
                        return list.get(k - 1);
                    }
                    root = root.left;
                }
            }
        }
        return list.get(list.size() - k);
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
