package com.bobo.easy;

import com.bobo.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/7/20 17:26
 *
 *
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 *
 * 自除数
 *
 * 728
 */
public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * 检查num是否为自除数
     * @param num
     * @return
     */
    public static boolean check(int num) {
        int cur = num;
        while (cur != 0) {
            int digit = cur % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            cur /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1,22);
        for (Integer num : list){
            System.out.print(num + " ");
        }

    }
}
