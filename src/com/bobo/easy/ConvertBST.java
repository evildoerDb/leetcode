package com.bobo.easy;

import java.util.Stack;

/**
 * @author Boild
 * @date 2020-05-05
 */
public class ConvertBST {

    /**
     * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/convert-bst-to-greater-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * 累死于序列化 像中序遍历一样 从最后一个元素加起
     * @param root
     * @return
     */
    public TreeNode convertBST(TreeNode root) {

        int sum = 0;

        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || null != node) {

            while (node != null) {
                stack.add(node);
                node = node.right;
            }
            node = stack.pop();
            sum += node.val;
            node.val = sum;
            node = node.left;
        }
        return root;
    }





    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
