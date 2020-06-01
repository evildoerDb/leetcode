package com.bobo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Boild
 * @date 2020-05-28
 */
public class GetAllElements {

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || null != root1) {
            if (root1 != null) {
                stack.push(root1);
                root1 = root1.left;
            } else {
                root1 = stack.pop();
                list.add(root1.val);
                root1 = root1.right;
            }
        }
        stack.clear();
        while (!stack.isEmpty() || null != root2) {
            if (root2 != null) {
                stack.push(root2);
                root2 = root2.left;
            } else {
                root2 = stack.pop();
                list.add(root2.val);
                root2 = root2.right;
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        TreeNode root11 = new TreeNode(1);
        TreeNode root14 = new TreeNode(4);
        root1.left = root11;
        root1.right = root14;

        TreeNode root2 = new TreeNode(1);
        TreeNode root20 = new TreeNode(0);
        TreeNode root23 = new TreeNode(3);
        root2.left = root20;
        root2.right = root23;

        List<Integer> allElements = getAllElements(root1, root2);
        System.out.println(allElements);

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
