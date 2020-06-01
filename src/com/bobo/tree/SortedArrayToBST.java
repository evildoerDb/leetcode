package com.bobo.tree;

/**
 * @author Boild
 * @date 2020-06-01
 */
public class SortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (null == nums || nums.length == 0) {
            return null;
        }


        TreeNode root = build(nums, 0, nums.length - 1);
        return root;
    }


    /**
     *
     * @param nums 数组
     * @param begin 开始
     * @param end 结束
     * @return
     */
    private static TreeNode build(int[] nums, int begin, int end) {
        if (begin > end) {
            return null;
        }
        int mid = (begin + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, begin, mid - 1);
        root.right = build(nums, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};

        TreeNode root = sortedArrayToBST(arr);

        System.out.println(root);

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
