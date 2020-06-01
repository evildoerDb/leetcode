package com.bobo.tree;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author Boild
 * @date 2020-06-02
 */
public class FindTarget {


    /**
     * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();
        if (null != root) {
            while (!stack.isEmpty() || null != root) {
                if (null != root) {
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop();
                    if (set.contains(k - root.val)) {
                        return true;
                    }
                    set.add(root.val);
                    root = root.right;
                }
            }
        }

        return false;
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
