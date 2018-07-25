package com.bobo.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/7/25 16:14
 *
 *
 * Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
 *
 * Example 1:
 *
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 * 821
 */
public class ShortestToChar {

    /**
     * 暴力解法
     * @param S
     * @param C
     * @return
     */
    public static int[] shortestToChar(String S, char C) {
        int [] arr = new int [S.length()];
        char [] charArr = S.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < charArr.length ; i++){
            if (charArr[i] == C){
                list.add(i);
            }
        }
        for (int i = 0 ; i < charArr.length; i++){
            int min = Integer.MAX_VALUE;
            for (Integer temp : list){
                min = Math.min(min,Math.abs(i - temp));
            }
            arr[i] = min;
        }
        return arr;
    }

    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        int [] arr = shortestToChar2(S,C);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    /**
     * 两次遍历 时间复杂度为O(n) 空间复杂度为O(1)
     * @param S
     * @param C
     * @return
     */
    public static int [] shortestToChar2(String S,char C){
        int length = S.length();
        int [] arr = new int[length];
        int pos = Integer.MAX_VALUE;
        for (int i = 0 ; i< length ; i++){
            if (S.charAt(i) == C){
                pos = i;
            }
            arr[i] = Math.abs(i - pos);
        }

        for (int i = length -1 ; i >= 0 ; i--){
            if (S.charAt(i) == C){
                pos = i;
            }
            arr[i] = Math.min(Math.abs(i - pos),arr[i]);
        }
        return arr;
    }
}
