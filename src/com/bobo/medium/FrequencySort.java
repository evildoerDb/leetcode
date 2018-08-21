package com.bobo.medium;

import java.util.HashMap;

/**
 * Created by evildoerDb on 2018/8/21 11:26
 *
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 * Example 1:
 *
 * Input:
 * "tree"
 *
 * Output:
 * "eert"
 *
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 *
 * 451
 */
public class FrequencySort {

    public static String frequencySort(String s) {
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++){
            arr[s.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()){
            int max =0;
            int idx = 0;
            for (int i = 0; i < 256; i++){
                if (max < arr[i]){
                    max = arr[i];
                    idx = i;

                }
            }
            for (int i = 0 ; i < max; i++){
                sb.append(String.valueOf((char)idx));
            }
            arr[idx] =0;
            max = 0; idx =0;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "tree";
        System.out.println(frequencySort(str));
//        System.out.println((char) 97);
    }
}
