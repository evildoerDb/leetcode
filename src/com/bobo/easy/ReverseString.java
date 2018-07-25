package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/25 15:44
 *
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example:
 * Given s = "hello", return "olleh".
 *
 * 344
 */
public class ReverseString {

    /**
     * 反转字符串
     * @param s
     * @return
     */
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
