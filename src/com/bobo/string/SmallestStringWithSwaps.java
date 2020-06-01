package com.bobo.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Boild
 * @date 2020-05-23
 */
public class SmallestStringWithSwaps {

    /**
     * 给你一个字符串 s，以及该字符串中的一些「索引对」数组 pairs，其中 pairs[i] = [a, b] 表示字符串中的两个索引（编号从 0 开始）。
     *
     * 你可以 任意多次交换 在 pairs 中任意一对索引处的字符。
     *
     * 返回在经过若干次交换后，s 可以变成的按字典序最小的字符串。
     *
     *  
     *
     * 示例 1:
     *
     * 输入：s = "dcab", pairs = [[0,3],[1,2]]
     * 输出："bacd"
     * 解释：
     * 交换 s[0] 和 s[3], s = "bcad"
     * 交换 s[1] 和 s[2], s = "bacd"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/smallest-string-with-swaps
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @param pairs
     * @return
     */
    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        char[] chars = s.toCharArray();
        for (List<Integer> pair : pairs) {
            char temp = chars[pair.get(0)];
            chars[pair.get(0)] = chars[pair.get(1)];
            chars[pair.get(1)] = temp;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(Arrays.asList(0, 3));
        pairs.add(Arrays.asList(1, 2));
        pairs.add(Arrays.asList(0, 2));

        String result = smallestStringWithSwaps(s, pairs);
        System.out.println(result);
    }
}
