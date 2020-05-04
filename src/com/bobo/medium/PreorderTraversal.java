package com.bobo.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Boild
 * @date 2020-03-11
 */
public class PreorderTraversal {

    static List<Integer> list = new ArrayList<>();

    /**
     * 递归
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        helper(root, list);

        return list;
    }

    private static void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);

    }

    public static List<Integer> preorderTraversal2(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (stack.isEmpty()) {
                root = stack.pop();

                list.add(root.val);
                if (root.right != null) {
                    stack.push(root.right);
                }

                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }


        return list;
    }


    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        root.right = second;
        second.left = third;

        System.out.println(preorderTraversal2(root));
    }
}
