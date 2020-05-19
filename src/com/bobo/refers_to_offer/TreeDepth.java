package com.bobo.refers_to_offer;

/**
 * @author Boild
 * @date 2020-05-19
 */
public class TreeDepth {


    /**
     * 输入一棵二叉树，求该树的深度。
     * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     * @param root
     * @return
     */
    public static int TreeDepth(TreeNode root) {
        return depRoot(root, 0);
    }

    private static int depRoot(TreeNode root, int length) {
        if (null == root) {
            return length;
        }
        return Math.max(depRoot(root.left,length + 1),depRoot(root.right,length + 1));
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.left = node2;
        node2.right = node3;
        System.out.println(TreeDepth(node1));

    }


    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
}
