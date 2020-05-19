package com.bobo.weekly.one_eight_nine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Boild
 * @date 2020-05-17
 */
public class ArrangeWords {


    /**
     * 句子」是一个用空格分隔单词的字符串。给你一个满足下述格式的句子 text :
     *
     * 句子的首字母大写
     * text 中的每个单词都用单个空格分隔。
     * 请你重新排列 text 中的单词，使所有单词按其长度的升序排列。如果两个单词的长度相同，则保留其在原句子中的相对顺序。
     *
     * 请同样按上述格式返回新的句子。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：text = "Leetcode is cool"
     * 输出："Is cool leetcode"
     * 解释：句子中共有 3 个单词，长度为 8 的 "Leetcode" ，长度为 2 的 "is" 以及长度为 4 的 "cool" 。
     * 输出需要按单词的长度升序排列，新句子中的第一个单词首字母需要大写。
     * 示例 2：
     *
     * 输入：text = "Keep calm and code on"
     * 输出："On and keep calm code"
     * 解释：输出的排序情况如下：
     * "On" 2 个字母。
     * "and" 3 个字母。
     * "keep" 4 个字母，因为存在长度相同的其他单词，所以它们之间需要保留在原句子中的相对顺序。
     * "calm" 4 个字母。
     * "code" 4 个字母。
     * 示例 3：
     *
     * 输入：text = "To be or not to be"
     * 输出："To be or to be not"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/rearrange-words-in-a-sentence
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param text
     * @return
     */
    public static String arrangeWords(String text) {

        String[] s = text.split(" ");
        List<String> list = new ArrayList<>(s.length);
        for (String str : s) {
            list.add(str);
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }

        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {

                sb.append(list.get(i) + " ");
            } else {
                sb.append(list.get(i));
            }
        }
        String temp = sb.toString().toLowerCase();
        temp = temp.replaceFirst(String.valueOf(temp.charAt(0)), String.valueOf(temp.charAt(0)).toUpperCase());

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(arrangeWords("Leetcode is cool"));
    }
}
