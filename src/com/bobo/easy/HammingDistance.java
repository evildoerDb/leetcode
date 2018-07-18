package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/18 15:43
 *
 * 汉明距离
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * x ^ Y  相同为0   不同为1
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((z & 1) == 1) {
                count++;
            }
            z = z >> 1;
        }
        //jdk中自带的bitCount方法
        // return Integer.bitCount(x ^ y);
        return count;
    }
}
