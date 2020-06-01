package com.bobo.tree;

/**
 * @author Boild
 * @date 2020-05-26
 */
public class LongestUnivaluePath {

    /**
     * 给定一个二叉树，找到最长的路径，
     * 这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
     *
     *
     * @param root
     * @return
     */
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //TODO 待完善
        return 0;
    }

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
