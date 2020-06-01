package com.bobo.string;

import java.util.Stack;

/**
 * @author Boild
 * @date 2020-05-28
 */
public class DecodeString {


    private  StringBuilder res = new StringBuilder();
    /**
     * 给定一个经过编码的字符串，返回它解码后的字符串。
     *
     * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
     *
     * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
     *
     * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
     *
     * 示例:
     *
     * s = "3[a]2[bc]", 返回 "aaabcbc".
     * s = "3[a2[c]]", 返回 "accaccacc".
     * s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/decode-string
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public  String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int length = s.length();
        while (index < length) {
            if (s.charAt(index) != ']') {
                stack.push(s.charAt(index++));
            } else {
                Character ch = stack.pop();

                while (ch != '[') {
                    sb.append(ch);
                    ch = stack.pop();
                }

                ch = stack.pop();
                buildString(Integer.parseInt(ch+""), sb);
                if (!stack.isEmpty()) {
                    for (int i = 0; i < res.length(); i++) {
                        stack.push(res.charAt(i));
                    }
                    res.delete(0, res.length());
                }
                index++;
                sb.delete(0, sb.length());
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        if (sb.length() > 1) {
            buildString(1, sb);
        }

        return res.toString();
    }



    private  void buildString(int total, StringBuilder sb) {
        StringBuilder temp = sb.reverse();
        for (int i = 0; i < total; i++) {
            res.append(temp);
        }
    }
}
