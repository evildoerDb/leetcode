package com.bobo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Boild
 * @date 2020-05-22
 */
public class IsValidBST {

    /**
     * 验证是否是搜索二叉树
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        isValidBST(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void isValidBST(TreeNode root, List<Integer> list) {
        if (root != null) {
            isValidBST(root.left, list);
            list.add(root.val);
            isValidBST(root.right, list);
        }
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
