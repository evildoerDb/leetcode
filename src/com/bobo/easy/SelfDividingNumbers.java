package com.bobo.easy;

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
        for (int i = left; i <= right; i++){
            List<Integer> resList = getList(i);
            for (Integer temp : resList){
                if (i % temp !=0){break;}
                list.add(i);
            }
        }

        return list;
    }

    public static List<Integer>  getList(Integer num){
        List<Integer> list = new ArrayList<>();
        char [] chars = String.valueOf(num).toCharArray();

        for (int i = 0 ; i < chars.length ; i++){
            list.add(Integer.parseInt(String.valueOf(chars[i])));
        }
        return list;

    }

    public static void main(String[] args) {
        int left = 1;
        int right =10;

        //TODO
        //错误  要重做
        List<Integer> list = selfDividingNumbers(left,right);
        for (Integer i : list){
            System.out.print(i + ",");
        }
    }
}
