package com.bobo.medium;

/**
 * @author Boild
 * @date 2020-03-11
 */
public class CheckInclusion {


    /**
     * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
     *
     * 换句话说，第一个字符串的排列之一是第二个字符串的子串。
     *
     * 示例1:
     *
     * 输入: s1 = "ab" s2 = "eidbaooo"
     * 输出: True
     * 解释: s2 包含 s1 的排列之一 ("ba").
     *  
     *
     * 示例2:
     *
     * 输入: s1= "ab" s2 = "eidboaoo"
     * 输出: False
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/permutation-in-string
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 滑动窗口
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] arr = new int[26];
        int[] temp = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            temp[s2.charAt(i) - 'a']++;
        }

        if (validate(arr, temp)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {


            temp[s2.charAt(i) - 'a']++;
            temp[s2.charAt(i - s1.length()) - 'a']--;
            if (validate(arr, temp)) {
                return true;
            }


        }

        return false;
    }


    private static boolean validate(int[] arr, int[] temp) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "adc";

        String s2 = "dcda";

        System.out.println(checkInclusion(s1,s2));
    }
}
