package com.bobo.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Boild
 * @date 2020-05-26
 */
public class BuildTree {


    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLength = preorder.length;
        int inLength = inorder.length;
        if (preLength != inLength) {
            return null;
        }
        for (int i = 0; i < inLength; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preLength - 1, inorder, 0, inLength - 1);
    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight,
                               int[] inorder, int inLeft, int inRight) {

        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }

        int rootValue = preorder[preLeft];
        TreeNode root = new TreeNode(rootValue);

        int pIndex = map.get(rootValue);

        root.left = buildTree(preorder, preLeft + 1, pIndex - inLeft + preLeft, inorder, inLeft, pIndex - 1);
        root.right = buildTree(preorder, pIndex - inLeft + preLeft + 1, preRight, inorder, pIndex + 1, inRight);
        return root;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
