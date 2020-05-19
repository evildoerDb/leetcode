package com.bobo.refers_to_offer;

/**
 * @author Boild
 * @date 2020-05-19
 */
public class Mirror {

    public static void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        Mirror(root.left);
        Mirror(root.right);
    }


    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
