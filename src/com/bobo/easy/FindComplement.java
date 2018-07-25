package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/25 15:13
 *
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 *
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 *
 *
 * 求得num对应最高为上全为1 的最大数 然后减去num就是它的补数
 * 476
 */
public class FindComplement {

    public static int findComplement(int num) {
        int max = 0;
        int index=0;
        while(max < num){
            max += Math.pow(2,index);
            index++;
        }
        return max - num;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
