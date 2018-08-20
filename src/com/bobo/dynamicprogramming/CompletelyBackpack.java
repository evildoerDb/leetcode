package com.bobo.dynamicprogramming;

/**
 * Created by evildoerDb on 2018/8/20 11:26
 * 完全背包
 */
public class CompletelyBackpack {
    public static int completelyBackpack(int[] w,int[] c,int v){

        int[][] dp = new int[v+1][c.length];

        //初始化dp矩阵的第一行
        for (int i = 0; i < v + 1; i++){
            dp[0][i] = i >= c[0] ? w[0] : 0;
        }

        int max = dp[0][0];
        for (int i = 1; i < w.length;i++){
            for (int j = 1; j< v+1; j++){
                for (int k = 0; k * c[i] <= j;k++ ){
                    max = Math.max(dp[i-1][j],dp[i-1][k*c[i]] + k * w[i]);
                }

            }
        }
        return max;

    }

}
