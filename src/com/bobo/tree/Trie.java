package com.bobo.tree;

/**
 * @author Boild
 * @date 2020-05-23
 *
 * 前缀树
 */
public class Trie {


    private TreeNode root;

    public Trie() {
        root = new TreeNode();
    }


    /**
     * 插入操作
     * @param word
     */
    public void insert(String word) {
        if (word == null) {
            return;
        }
        char[] chars = word.toCharArray();
        TreeNode node = root;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            index = chars[i] - 'a';
            if (node.nexts[index] == null) {
                node.nexts[index] = new TreeNode();
            }
            node = node.nexts[index];
            node.path++;
        }
        node.end++;
    }

    public boolean search(String word) {
        if (word == null) {
            return false;
        }
        char[] chars = word.toCharArray();
        TreeNode node = root;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            index = chars[i] - 'a';
            if (node.nexts[index] == null) {
                return false;
            }
            node = node.nexts[index];
        }
        return node.end != 0;
    }

    public void delete(String word) {
        if (search(word)) {
            char[] chars = word.toCharArray();
            TreeNode node = root;
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                index = chars[i] - 'a';
                if (node.nexts[index].path-- == 1) {
                    node.nexts[index] = null;
                    return;
                }
                node = node.nexts[index];
            }
            node.end--;
        }
    }

    public int prefixNumber(String pre) {
        if (pre == null) {
            return 0;
        }
        char[] chars = pre.toCharArray();
        TreeNode node = root;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            index = chars[i] - 'a';
            if (node.nexts[index] == null) {
                return 0;
            }
            node = node.nexts[index];
        }
        return node.path;
    }


    static class TreeNode {
        /**
         * 有几个节点划过
         */
        int path;

        /**
         * 有几个点以当前节点结尾
         */
        int end;

        /**
         * 链接的节点
         */
        TreeNode[] nexts;

        public TreeNode(){
            this.path = 0;
            this.end = 0;
            nexts = new TreeNode[26];
        }
    }
}

