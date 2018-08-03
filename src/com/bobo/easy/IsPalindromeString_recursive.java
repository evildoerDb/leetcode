package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/27 10:36
 *
 * 判断字符串是否为回文字符串
 *
 * 递归解决
 */
public class IsPalindromeString_recursive {
    /**
     * 递归判断回文字符串
     *
     * @param s
     * @return
     */
    public static boolean ispalindromestringRecursive(String s){
        int start = 0;
        int end = s.length()-1;
        if (end > start){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }else {
                return ispalindromestringRecursive(s.substring(start+1).substring(0, end-1));
            }
        }

        return true;

    }


    /**
     * 字符串全排列
     *
     * @param s
     * @param from
     * @param to
     */
    @SuppressWarnings("AlibabaAvoidCommentBehindStatement")
    public static void getStringPermutations3(char[] s, int from, int to) {
        //边界检查
        if (s != null && to >= from && to < s.length && from >= 0) {
            if (from == to) { // 递归终止条件

                System.out.println(s);
            } else {
                for (int i = from; i <= to; i++) {
                    swap(s, i, from); // 交换前缀,作为结果中的第一个元素，然后对剩余的元素全排列
                    getStringPermutations3(s, from + 1, to); // 递归调用，缩小问题的规模
                    swap(s, from, i); // 换回前缀，复原字符数组
                }
            }
        }
    }

    public static void swap(char[] s, int from, int to) {
        char temp = s[from];
        s[from] = s[to];
        s[to] = temp;
    }

    public static void main(String[] args) {

        getStringPermutations3("abc".toCharArray(),0,2);
//        System.out.println("789987".substring(0,5));
    }

}
