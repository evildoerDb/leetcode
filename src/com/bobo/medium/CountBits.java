package com.bobo.medium;

/**
 * Created by evildoerDb on 2018/8/7 18:07
 *
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 *
 * Example 1:
 *
 * Input: 2
 * Output: [0,1,1]
 * Example 2:
 *
 * Input: 5
 * Output: [0,1,1,2,1,2]
 */
public class CountBits {

    /**
     * 利用jdk中的方法  时间复杂度O(n)
     * @param num
     * @return
     */
    public static int[] countBits(int num) {
        int [] arr = new int[num+1];
        for (int i = 0 ; i <= num; i++){
            arr[i] = Integer.bitCount(i);
        }
        return arr;
    }

    /**
     *
     * 右移一位  减少一个最右边的比特数 然后对应的值除2 再看移走的那位是否为1
     *
     * @param num
     * @return
     */
    public static int[] countBits1(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++){
            f[i] = f[i >> 1] + (i & 1);
        }
        return f;
    }
}
