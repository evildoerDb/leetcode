package com.bobo.dynamicprogramming;

/**
 * Created by evildoerDb on 2018/8/20 14:18
 *
 *
 * 最长公共递增子序列  即LIS
 *
 * 典型的动态规划的问题
 */
public class LongestIncreSubsequence {

    /**
     * O(n ^ 2) 获取dp的过程
     * dp数组代表的是 以i为结尾的最长递增子序列
     *
     * dp[i] 的值为 0到i -1 中最长的长度+1
     * @param arr
     * @return
     */
    public int[] getdp(int[] arr){
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 0 ;i < arr.length; i++){
            dp[i] = 1;
            for (int j = 0; j <i; j++){
                if (arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        return dp;
    }

    /**
     * 根据dp还原数组的过程 时间复杂度O(n)
     *
     * 找到dp数组的最大值和最大的长度
     *
     * 然后从最大长度开始往前遍历
     * @param arr
     * @param dp
     * @return
     */
    public int[] generateLIS(int[] arr,int [] dp){
        int max = 0;
        int index =0;
        for (int i = 0; i < dp.length; i++){
            if (dp[i] > max){
                max = dp[i];
                index =i;
            }
        }
        int[] result = new int[max];
        result[--max] = arr[index];
        for (int i = index; i>=0; i--){
            if (arr[i] < arr[index] && dp[i] == index -1){
                //还原数组
                result[--max] = arr[i];
                index = i;
            }
        }

        return result;
    }

    /**
     * 优化生成dp数组的过程
     *
     * 时间复杂度优化为O(nlogn)
     * @param arr
     * @return
     */
    public int[] getdp1(int[] arr){
        int[] dp = new int[arr.length];
        int[] ends = new int[arr.length];
        ends[0] = arr[0];
        dp[0] = 1;
        int right = 0;
        int l = 0;
        int r = 0;
        int m = 0;
        for (int i = 1; i < arr.length; i++) {
            l = 0;
            r = right;
            while (l <= r) {
                m = (l + r) / 2;
                if (arr[i] > ends[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            right = Math.max(right, l);
            ends[l] = arr[i];
            dp[i] = l + 1;
        }

        return dp;

    }

}
