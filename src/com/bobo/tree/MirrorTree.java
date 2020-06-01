package com.bobo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Boild
 * @date 2020-05-23
 */
public class MirrorTree {


    /**
     * 镜像二叉树
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {

        mirrorTreeHelp(root);
        return root;
    }

    private void mirrorTreeHelp(TreeNode root) {
        if (root == null) {
            return;
        } else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirrorTreeHelp(root.left);
            mirrorTreeHelp(root.right);
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

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(10);
        list.add(null);
        System.out.println(list);
    }
}
