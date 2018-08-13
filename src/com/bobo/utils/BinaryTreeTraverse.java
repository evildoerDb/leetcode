package com.bobo.utils;

import java.util.Stack;

/**
 * Created by evildoerDb on 2018/8/13 10:36
 */
public class BinaryTreeTraverse {


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 递归先序遍历
     * @param root
     */
    public void perOrderByRecu(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.val + " ");
        perOrderByRecu(root.left);
        perOrderByRecu(root.right);
    }

    /**
     * 递归中序遍历
     * @param root
     */
    public void inOrderByRecu(TreeNode root){
        if (root == null){
            return;
        }
        inOrderByRecu(root.left);
        System.out.println(root.val + " ");
        inOrderByRecu(root.right);
    }

    /**
     * 递归后序遍历
     * @param root
     */
    public void posOrderByRecu(TreeNode root){
        if (root == null){
            return;
        }
        posOrderByRecu(root.left);
        posOrderByRecu(root.right);
        System.out.println(root.val + " ");
    }

    /**
     * 非递归先序遍历
     * @param root
     */
    public void inOrderBy(TreeNode root){
        if (root != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()){
                root = stack.pop();
                System.out.println(root.val + " ");
                if (root.right != null){
                    stack.push(root.right);
                }

                if (root.left != null){
                    stack.push(root.left);
                }
            }
        }
    }


    /**
     * 非递归中序遍历
     * @param root
     */
    public void inOeder(TreeNode root){
        if (root != null){
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || root != null){
                if (root != null){
                    stack.push(root);
                    root = root.left;
                }else {
                    root = stack.pop();
                    System.out.println(root.val + " ");
                    root = root.right;
                }
            }
        }
    }

    /**
     * 非递归后序遍历  前序遍历为 根 左 右  压栈顺序为 根 右 左 刚好和后序遍历相反
     * @param root
     */
    public void posOrder(TreeNode root){
        if (root != null){
            Stack<TreeNode> stack1 = new Stack<>();
            Stack<TreeNode> stack2 = new Stack<>();
            stack1.push(root);
            while (!stack1.isEmpty()){
                root = stack1.pop();
                stack2.push(root);
                if (root.right != null){
                    stack1.push(root.right);
                }

                if (root.left != null){
                    stack1.push(root.left);
                }
            }
            while (!stack2.isEmpty()){
                System.out.println(stack2.pop() + " ");
            }
        }
    }
}
