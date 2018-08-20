package com.bobo.dynamicprogramming;

/**
 * Created by evildoerDb on 2018/8/20 10:32
 *
 * 01背包
 */
public class Backpack01 {

    /**
     * 正常的dp
     * @param w 表示物品价值
     * @param c 表示物品重量
     * @param v 表示背包大小
     * @return
     */
    public static int backPack01(int[] w,int[] c,int v){

        int[][] dp = new int[v+1][c.length];

        //初始化dp矩阵的第一行
        for (int i = 0; i < v + 1; i++){
            dp[0][i] = i >= c[0] ? w[0] : 0;
        }

        int max = dp[0][0];
        for (int i = 1; i < w.length;i++){
            for (int j = 1; j< v+1; j++){
                if (j >= w[i]){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-c[i]] + w[i]);
                    max = Math.max(max,dp[i][j]);
                }else {
                    dp[i][j] = dp[i-1][j];
                    max = Math.max(max,dp[i][j]);
                }

            }
        }
        return max;

    }



}
