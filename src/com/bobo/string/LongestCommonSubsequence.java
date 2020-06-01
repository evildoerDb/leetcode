package com.bobo.string;

/**
 * @author Boild
 * @date 2020-05-23
 */
public class LongestCommonSubsequence {

    /**
     * 最长公共子序列
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequence(String text1, String text2) {

        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();
        int[][] dp = new int[char1.length][char2.length];
        dp[0][0] = char1[0] == char2[0] ? 1 : 0;
        for (int i = 1; i < char1.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], char1[i] == char2[0] ? 1 : 0);
        }
        for (int j = 1; j < char2.length; j++) {
            dp[0][j] = Math.max(dp[0][j - 1], char1[0] == char2[j] ? 1 : 0);
        }
        for (int i = 1; i < char1.length; i++) {
            for (int j = 1; j < char2.length; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (char1[i] == char2[j]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }
        return dp[char1.length - 1][char2.length - 1];

    }

    public static int longestCommonSubsequence2(String text1, String text2) {

        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();
        int[] dp = new int[char1.length];
        dp[0] = char1[0] == char2[0] ? 1 : 0;
        for (int i = 1; i < char1.length; i++) {
            dp[i] = Math.max(dp[i - 1], char1[i] == char2[0] ? 1 : 0);
        }

        for (int i = 1; i < char1.length; i++) {
            dp[0] = Math.max(dp[0], char1[0] == char2[i] ? 1 : 0);
            for (int j = 1; j < char2.length; j++) {
                dp[j] = Math.max(dp[j - 1], dp[j]);
                if (char1[i] == char2[j]) {
                    dp[j] = Math.max(dp[j], dp[j - 1] + 1);
                }
            }
        }
        return dp[char1.length - 1];

    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence2(s1, s2));

    }
}
