package com.bobo.dynamicprogramming;

/**
 * @author Boild
 * @date 2020-05-25
 */
public class CoinChange {

    /**
     * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
     * 如果没有任何一种硬币组合能组成总金额，返回 -1。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: coins = [1, 2, 5], amount = 11
     * 输出: 3
     * 解释: 11 = 5 + 5 + 1
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/coin-change
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        int max = Integer.MAX_VALUE;
        for (int i = 1; i < amount + 1; i++) {
            dp[0][i] = max;
            if (i - coins[0] >= 0 && dp[0][i - coins[0]] != max) {
                dp[0][i] = dp[0][i - coins[0]] + 1;
            }
        }
        int left = 0;
        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j < amount + 1; j++) {
                left = max;
                if (j - coins[i] >= 0 && dp[i][j - coins[i]] != max) {
                    left = dp[i][j - coins[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i - 1][j]);
            }
        }
        return dp[coins.length - 1][amount] == max ? -1 : dp[coins.length - 1][amount];
    }
}
