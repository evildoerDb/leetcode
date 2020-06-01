package com.bobo.tree;

/**
 * @author Boild
 * @date 2020-05-28
 */
public class InsertIntoBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        } else if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else if (root.val < val){
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }



    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
