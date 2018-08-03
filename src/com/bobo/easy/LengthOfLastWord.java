package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/3 17:35
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 *
 * 58
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String [] strs = s.split(" ");
        if (strs.length == 0){
            return 0;
        }

//        python解决办法
//        return len(s.rstrip(' ').split(' ')[-1])
        return strs[strs.length-1].length();
    }
}
