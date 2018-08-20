package com.bobo.dynamicprogramming;

/**
 * Created by evildoerDb on 2018/8/20 15:33
 *
 * 最长公共子串
 */
public class LCST {

    public int[][] getdp(char[] chars1,char[] chars2){
        int[][] dp = new int[chars1.length][chars2.length];

        for (int i =0 ;i < chars1.length;i++){
            dp[0][i] = chars1[i] == chars2[0] ? 1 : 0;
        }

        for (int i =0 ;i < chars2.length;i++){
            dp[i][0] = chars2[i] == chars1[0] ? 1 : 0;
        }

        for (int i = 1; i < chars1.length; i++){
            for (int j = 1; j < chars2.length; j++){
                if (chars1[i] == chars2[j]){
                    dp[i][j] = dp[i - 1] [j - 1] + 1;
                }
            }
        }

        return dp;
    }

    public String lcst1(String str1, String str2) {
        if (str1 == null || str2 == null || "".equals(str1) || "".equals(str2)) {
            return "";
        }
        char[] chs1 = str1.toCharArray();
        char[] chs2 = str2.toCharArray();
        int[][] dp = getdp(chs1, chs2);
        int end = 0;
        int max = 0;
        for (int i = 0; i < chs1.length; i++) {
            for (int j = 0; j < chs2.length; j++) {
                if (dp[i][j] > max) {
                    end = i;
                    max = dp[i][j];
                }
            }
        }
        return str1.substring(end - max + 1, end + 1);
    }
}
