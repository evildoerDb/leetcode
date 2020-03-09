package com.bobo.comp.first;

/**
 * @author Boild
 * @date 2020-03-07
 */
public class SortString {

    /**
     * 从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
     * 从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
     * 重复步骤 2 ，直到你没法从 s 中选择字符。
     * 从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
     * 从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
     * 重复步骤 5 ，直到你没法从 s 中选择字符。
     * 重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。
     * @param s
     * @return
     */
    public static String sortString(String s) {

        StringBuilder builder = new StringBuilder();
        int[] map = new int[26];
        for (char c : s.toCharArray()) map[c - 'a']++;
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < 26; i++) {
                if (map[i] > 0) {
                    builder.append((char) (i + 'a'));
                    map[i]--;
                    flag = true;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (map[i] > 0) {
                    builder.append((char) (i + 'a'));
                    map[i]--;
                    flag = true;
                }
            }
        } while (flag);
        return builder.toString();

    }

    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(sortString(s));
    }
}
