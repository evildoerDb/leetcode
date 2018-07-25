package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/25 15:48
 *
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 *
 *
 * 557
 */
public class ReverseWords {


    /**
     * 暴力解法
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        String [] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int j = 0 ; j < strs.length ; j++){
            StringBuilder sbTemp = new StringBuilder();
            for (int i = strs[j].length() -1; i >=0; i--){
                sbTemp.append(strs[j].charAt(i));
            }
            if (j != strs.length -1){
                sb.append(sbTemp+" ");
            }else {
                sb.append(sbTemp);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        //TODO
        //暴力解法 待优化  一定情况下空间复杂度过高
        String result = reverseWords2("Let's take LeetCode contest");
        System.out.println(result);

    }

    public static String reverseWords2(String s){
        String [] strs  = s.split(" ");
        for (int i = 0 ; i < strs.length; i++){
            strs[i] = new StringBuilder(strs[i]).reverse().toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strs ){
            sb.append(str + " ");
        }
        return sb.toString().trim();
    }
}
