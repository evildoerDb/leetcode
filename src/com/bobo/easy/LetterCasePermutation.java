package com.bobo.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by evildoerDb on 2018/8/8 15:27
 *
 * Given a string S, we can transform every letter individually to be lowercase or
 * uppercase to create another string.
 * Return a list of all possible strings we could create.
 *
 * 改变任何一个字母的大小写生成一个新的字符串
 */
public class LetterCasePermutation {

    /**
     * DFS 深搜
     * @param S
     * @return
     */
    public List<String> letterCasePermutation(String S) {
        if (S == null) {
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();
        dfs(S, list, 0);
        return list;
    }

    public void dfs(String s, List<String> list, int pos) {
        if (pos == s.length()) {
            list.add(s);
            return;
        }
        if (s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
            dfs(s, list, pos + 1);
            return;
        }

        char[] chs = s.toCharArray();
        chs[pos] = Character.toLowerCase(chs[pos]);
        dfs(String.valueOf(chs), list, pos + 1);

        chs[pos] = Character.toUpperCase(chs[pos]);
        dfs(String.valueOf(chs), list, pos + 1);
    }

    /**
     * BFS 来自题目讨论区
     * @param S
     * @return
     */
    public List<String> letterCasePermutation2(String S) {
        if (S == null) {
            return new LinkedList<>();
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                continue;
            }
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }

        return new LinkedList<>(queue);
    }
}
