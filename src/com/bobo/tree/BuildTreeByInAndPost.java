package com.bobo.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Boild
 * @date 2020-05-26
 */
public class BuildTreeByInAndPost {


    Map<Integer, Integer> map = new HashMap<>();

    /**
     * 根据中序和后序遍历构造二叉树
     * @param inorder 中序遍历数组
     * @param postorder 后序遍历数组
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inLength = inorder.length;
        int postLength = postorder.length;

        if (inLength != postLength) {
            return null;
        }

        for (int i = 0; i < inLength; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inLength - 1, postorder, 0, postLength - 1);
    }


    /**
     * 递归函数
     * @param inorder 中序遍历数组
     * @param inLeft 中序数组左边界
     * @param inRight 中序数组右边界
     * @param postorder 后序遍历数组
     * @param postLeft 后序遍历数组左边界
     * @param postRight 后序遍历数组右边界
     * @return
     */
    private TreeNode buildTree(int[] inorder, int inLeft, int inRight,
                               int[] postorder, int postLeft, int postRight) {

        if (inLeft > inRight || postLeft > postRight) {
            return null;
        }
        int rootValue = postorder[postRight];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = map.get(rootValue);
        root.left = buildTree(inorder, inLeft, rootIndex - 1, postorder, postLeft, postLeft + rootIndex - inLeft - 1);
        root.right = buildTree(inorder, rootIndex + 1, inRight, postorder,  postLeft + rootIndex - inLeft, postRight - 1);
        return root;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
